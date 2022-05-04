# Campaigns

```java
CampaignsController campaignsController = client.getCampaignsController();
```

## Class Name

`CampaignsController`

## Methods

* [Check Campaign Status](../../doc/controllers/campaigns.md#check-campaign-status)
* [List Campaigns](../../doc/controllers/campaigns.md#list-campaigns)
* [Order Campaign](../../doc/controllers/campaigns.md#order-campaign)
* [Retrieve Campaign](../../doc/controllers/campaigns.md#retrieve-campaign)
* [Take Campaign Offline](../../doc/controllers/campaigns.md#take-campaign-offline)


# Check Campaign Status

This is a specialized endpoint for Campaign statuses only. Although the Campaign Details endpoint also returns the
status of a campaign, if you only need to get the specific status of a Campaign, this endpoint is
optimized for that.

```java
CompletableFuture<CheckCampaignStatusresponseModel> checkCampaignStatusAsync(
    final UUID campaignId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `campaignId` | `UUID` | Template, Required | Id of the Campaign you want the status of |

## Response Type

[`CheckCampaignStatusresponseModel`](../../doc/models/check-campaign-statusresponse-model.md)

## Example Usage

```java
UUID campaignId = UUID.fromString("000026a2-0000-0000-0000-000000000000");

campaignsController.checkCampaignStatusAsync(campaignId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "data": {
    "campaignId": "ffb37e76-d4fe-5ad6-8441-b02c1b15aa4c",
    "status": "online",
    "orderedProductsStatuses": [
      {
        "productId": "8eefb7a1-c5f3-5739-9fe6-cea17e2ee742",
        "status": "online",
        "statusDescription": "null"
      }
    ]
  }
}
```


# List Campaigns

Displays all the existing Campaigns already ordered for this Partner is as simple as executing a `GET`
request against the endpoint `/campaigns`

```java
CompletableFuture<ResultSet1Model> listCampaignsAsync(
    final String companyId,
    final Double limit,
    final Double offset)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `companyId` | `String` | Query, Required | CompanyId to filter the results on |
| `limit` | `Double` | Query, Optional | Amount of products returned |
| `offset` | `Double` | Query, Optional | Starting point |

## Response Type

[`ResultSet1Model`](../../doc/models/result-set-1-model.md)

## Example Usage

```java
String companyId = "companyId0";

campaignsController.listCampaignsAsync(companyId, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total": 1337,
  "limit": 50,
  "offset": 0,
  "data": [
    {
      "companyId": "dd1c5be0-b0e1-41c8-ba92-e876da16c38b",
      "orderReference": "PO_567_2019",
      "recruiterInfo": {
        "id": "af78ce39-94a8-45dc-8c68-35f4d684fa5f",
        "name": "John Doe",
        "emailAddress": "john.doe@vonq.com"
      },
      "campaignName": "Software Development Manager",
      "postingDetails": {
        "title": "Come work for us, we're looking for amazing Software Developers",
        "description": "Are you a LEADER and a BUILDER?  Global is looking for individuals who are dynamic, sales-oriented, and who want to control their destiny.  With a full training programme and consistent support, Global will provide you with the tools to excel in this very lucrative business.",
        "organization": {
          "name": "Vonq",
          "companyLogo": "http://static.ats.com/public/vonq-company-logo.png"
        },
        "workingLocation": {
          "addressLine1": "Westblaak 175",
          "postcode": "3012 KJ",
          "city": "Rotterdam",
          "country": "The Netherlands",
          "allowsRemoteWork": 0
        },
        "contactInfo": {
          "name": "Janet Doe",
          "phoneNumber": "+31 6 5555 5555",
          "emailAddress": "janet.doe@vonq.com"
        },
        "yearsOfExperience": 5,
        "employmentType": "permanent",
        "weeklyWorkingHours": {
          "from": 32,
          "to": 40
        },
        "salaryIndication": {
          "period": "yearly",
          "range": {
            "from": 56000,
            "to": 60000,
            "currency": "EUR"
          }
        },
        "jobPageUrl": "http://amadeus-hospitality-it-careers.com/vacancy/software-development-manager-breda",
        "applicationUrl": "http://amadeus-hospitality-it-careers.com/vacancy/software-development-manager-breda/apply"
      },
      "targetGroup": {
        "educationLevel": [
          {
            "description": "Vendor-specific value",
            "vonqId": "23"
          }
        ],
        "seniority": [
          {
            "description": "Vendor-specific value",
            "vonqId": "23"
          }
        ],
        "industry": [
          {
            "description": "Vendor-specific value",
            "vonqId": "23"
          }
        ],
        "jobCategory": [
          {
            "description": "Vendor-specific value",
            "vonqId": "23"
          }
        ]
      },
      "orderedProducts": [
        "89",
        "889",
        "2cbad29e-a510-52fc-bbdf-e873320e89f5"
      ],
      "orderedProductsSpecs": [
        {
          "productId": "2cbad29e-a510-52fc-bbdf-e873320e89f5",
          "status": "online",
          "statusDescription": "",
          "deliveredOn": "2020-11-30T11:00:15+0000",
          "duration": "20 days",
          "durationPeriod": {
            "range": "days",
            "period": 30
          },
          "utm": "utm_medium=social&utm_source=facebook&utm_campaign=example",
          "jobBoardLink": "http://job.ad.com/software-developer",
          "contractId": "06a8f6f0-5e0e-4614-869e-ab95a8530633",
          "postingRequirements": {
            "someText": "example",
            "multipleSelectField": [
              "123",
              "234"
            ],
            "someIntValue": 22
          }
        }
      ],
      "postings": [
        {
          "name": "Linkedin.com 30 days",
          "clicks": 14
        }
      ]
    }
  ]
}
```


# Order Campaign

Once your Customer has decided on a list of Channels they would like to buy, you can send the list along with
publishing information as a `POST` request in order to create a `Campaign`. In return, you'll receive
the id of the newly created `Campaign` along with the URL where you can access that Campaign information.
For "My Contracts" type of Products, there is no expiration. The vacancy can be taken offline either by the job board or manually, by calling the "[Take a campaign offline](https://vonq.stoplight.io/docs/hapi/b3A6MzM0NDA3MzQ-take-a-campaign-offline)" endpoint.

#### Target group

You should use the following endpoints for the target group information:

- [**`Industry`**](b3A6MzM0NDA3Mzg-industry-names)

- [**`Job Function`**](b3A6MzM0NDA3MzU-job-functions)

- [**`Education Level`**](b3A6MzM0NDA3Mzk-retrieve-education-level-taxonomy)

- [**`Seniority`**](b3A6MzM0NDA3NDA-retrieve-seniority-taxonomy)

```java
CompletableFuture<OrderCampaignSuccessResponseModel> orderCampaignAsync(
    final CampaignOrderModel body,
    final String companyId,
    final String limit,
    final String offset,
    final String xCustomerId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CampaignOrderModel`](../../doc/models/campaign-order-model.md) | Body, Required | - |
| `companyId` | `String` | Query, Optional | - |
| `limit` | `String` | Query, Optional | - |
| `offset` | `String` | Query, Optional | - |
| `xCustomerId` | `String` | Header, Optional | The ID of the end-user creating the order. Only required if you are using HAPI Job Post and creating orders with contracts. |

## Response Type

[`OrderCampaignSuccessResponseModel`](../../doc/models/order-campaign-success-response-model.md)

## Example Usage

```java
CampaignOrder body = new CampaignOrder();
body.setCompanyId("dd1c5be0-b0e1-41c8-ba92-e876da16c38b");
body.setRecruiterInfo(new RecruiterInfo());
body.getRecruiterInfo().setName("John Doe");
body.setPostingDetails(new PostingDetails());
body.getPostingDetails().setTitle("Come work for us, we're looking for amazing Software Developers");
body.getPostingDetails().setDescription("Are you a LEADER and a BUILDER?  Global is looking for individuals who are dynamic, sales-oriented, and who want to control their destiny.  With a full training programme and consistent support, Global will provide you with the tools to excel in this very lucrative business.");
body.getPostingDetails().setOrganization(new PostingOrganization());
body.getPostingDetails().getOrganization().setName("Vonq");
body.getPostingDetails().getOrganization().setCompanyLogo("http://static.ats.com/public/vonq-company-logo.png");
body.getPostingDetails().setWorkingLocation(new PostingWorkingLocation());
body.getPostingDetails().getWorkingLocation().setAddressLine1("Westblaak 175");
body.getPostingDetails().getWorkingLocation().setPostcode("3012 KJ");
body.getPostingDetails().getWorkingLocation().setCity("Rotterdam");
body.getPostingDetails().getWorkingLocation().setCountry("The Netherlands");
body.getPostingDetails().setYearsOfExperience(220.92);
body.getPostingDetails().setEmploymentType(EmploymentTypeEnum.PERMANENT);
body.getPostingDetails().setWeeklyWorkingHours(new PostingWeeklyWorkingHours());
body.getPostingDetails().getWeeklyWorkingHours().setTo(69.94);
body.getPostingDetails().setSalaryIndication(new PostingSalaryIndication());
body.getPostingDetails().getSalaryIndication().setPeriod(PeriodEnum.YEARLY);
body.getPostingDetails().getSalaryIndication().setRange(new Range3());
body.getPostingDetails().getSalaryIndication().getRange().setTo(22.8);
body.getPostingDetails().setJobPageUrl("http://amadeus-hospitality-it-careers.com/vacancy/software-development-manager-breda");
body.getPostingDetails().setApplicationUrl("http://amadeus-hospitality-it-careers.com/vacancy/software-development-manager-breda/apply");
body.setTargetGroup(new TargetGroup());
body.getTargetGroup().setEducationLevel(new LinkedList<>());

TargetGroupElement bodyTargetGroupEducationLevel0 = new TargetGroupElement();
bodyTargetGroupEducationLevel0.setDescription("Element name");
bodyTargetGroupEducationLevel0.setVonqId("23");
body.getTargetGroup().getEducationLevel().add(bodyTargetGroupEducationLevel0);

TargetGroupElement bodyTargetGroupEducationLevel1 = new TargetGroupElement();
bodyTargetGroupEducationLevel1.setDescription("Element name");
bodyTargetGroupEducationLevel1.setVonqId("23");
body.getTargetGroup().getEducationLevel().add(bodyTargetGroupEducationLevel1);

body.getTargetGroup().setSeniority(new LinkedList<>());

TargetGroupElement bodyTargetGroupSeniority0 = new TargetGroupElement();
bodyTargetGroupSeniority0.setDescription("Element name");
bodyTargetGroupSeniority0.setVonqId("23");
body.getTargetGroup().getSeniority().add(bodyTargetGroupSeniority0);

TargetGroupElement bodyTargetGroupSeniority1 = new TargetGroupElement();
bodyTargetGroupSeniority1.setDescription("Element name");
bodyTargetGroupSeniority1.setVonqId("23");
body.getTargetGroup().getSeniority().add(bodyTargetGroupSeniority1);

TargetGroupElement bodyTargetGroupSeniority2 = new TargetGroupElement();
bodyTargetGroupSeniority2.setDescription("Element name");
bodyTargetGroupSeniority2.setVonqId("23");
body.getTargetGroup().getSeniority().add(bodyTargetGroupSeniority2);

body.getTargetGroup().setIndustry(new LinkedList<>());

TargetGroupElement bodyTargetGroupIndustry0 = new TargetGroupElement();
bodyTargetGroupIndustry0.setDescription("Element name");
bodyTargetGroupIndustry0.setVonqId("23");
body.getTargetGroup().getIndustry().add(bodyTargetGroupIndustry0);

TargetGroupElement bodyTargetGroupIndustry1 = new TargetGroupElement();
bodyTargetGroupIndustry1.setDescription("Element name");
bodyTargetGroupIndustry1.setVonqId("23");
body.getTargetGroup().getIndustry().add(bodyTargetGroupIndustry1);

TargetGroupElement bodyTargetGroupIndustry2 = new TargetGroupElement();
bodyTargetGroupIndustry2.setDescription("Element name");
bodyTargetGroupIndustry2.setVonqId("23");
body.getTargetGroup().getIndustry().add(bodyTargetGroupIndustry2);

body.getTargetGroup().setJobCategory(new LinkedList<>());

TargetGroupElement bodyTargetGroupJobCategory0 = new TargetGroupElement();
bodyTargetGroupJobCategory0.setDescription("Element name");
bodyTargetGroupJobCategory0.setVonqId("23");
body.getTargetGroup().getJobCategory().add(bodyTargetGroupJobCategory0);

TargetGroupElement bodyTargetGroupJobCategory1 = new TargetGroupElement();
bodyTargetGroupJobCategory1.setDescription("Element name");
bodyTargetGroupJobCategory1.setVonqId("23");
body.getTargetGroup().getJobCategory().add(bodyTargetGroupJobCategory1);

body.setOrderedProducts(new LinkedList<>());
body.getOrderedProducts().add("orderedProducts2");

campaignsController.orderCampaignAsync(body, null, null, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "campaignId": "ffb37e76-d4fe-5ad6-8441-b02c1b15aa4c"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | - | [`OrderCampaignErrorResponseException`](../../doc/models/order-campaign-error-response-exception.md) |


# Retrieve Campaign

Retrieve the details of a specific Campaign. Only Campaigns created by the calling Partner can be
retrieved.

```java
CompletableFuture<ListCampaignResponseModel> retrieveCampaignAsync(
    final UUID campaignId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `campaignId` | `UUID` | Template, Required | Id of the Campaign that you want to retrieve |

## Response Type

[`ListCampaignResponseModel`](../../doc/models/list-campaign-response-model.md)

## Example Usage

```java
UUID campaignId = UUID.fromString("000026a2-0000-0000-0000-000000000000");

campaignsController.retrieveCampaignAsync(campaignId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "data": {
    "companyId": "dd1c5be0-b0e1-41c8-ba92-e876da16c38b",
    "orderReference": "PO_567_2019",
    "recruiterInfo": {
      "id": "af78ce39-94a8-45dc-8c68-35f4d684fa5f",
      "name": "John Doe",
      "emailAddress": "john.doe@vonq.com"
    },
    "campaignName": "Software Development Manager",
    "postingDetails": {
      "title": "Come work for us, we're looking for amazing Software Developers",
      "description": "Are you a LEADER and a BUILDER?  Global is looking for individuals who are dynamic, sales-oriented, and who want to control their destiny.  With a full training programme and consistent support, Global will provide you with the tools to excel in this very lucrative business.",
      "organization": {
        "name": "Vonq",
        "companyLogo": "http://static.ats.com/public/vonq-company-logo.png"
      },
      "workingLocation": {
        "addressLine1": "Westblaak 175",
        "postcode": "3012 KJ",
        "city": "Rotterdam",
        "country": "The Netherlands",
        "allowsRemoteWork": 0
      },
      "contactInfo": {
        "name": "Janet Doe",
        "phoneNumber": "+31 6 5555 5555",
        "emailAddress": "janet.doe@vonq.com"
      },
      "yearsOfExperience": 5,
      "employmentType": "permanent",
      "weeklyWorkingHours": {
        "from": 32,
        "to": 40
      },
      "salaryIndication": {
        "period": "yearly",
        "range": {
          "from": 56000,
          "to": 60000,
          "currency": "EUR"
        }
      },
      "jobPageUrl": "http://amadeus-hospitality-it-careers.com/vacancy/software-development-manager-breda",
      "applicationUrl": "http://amadeus-hospitality-it-careers.com/vacancy/software-development-manager-breda/apply"
    },
    "targetGroup": {
      "educationLevel": [
        {
          "description": "Vendor-specific value",
          "vonqId": "23"
        }
      ],
      "seniority": [
        {
          "description": "Vendor-specific value",
          "vonqId": "23"
        }
      ],
      "industry": [
        {
          "description": "Vendor-specific value",
          "vonqId": "23"
        }
      ],
      "jobCategory": [
        {
          "description": "Vendor-specific value",
          "vonqId": "23"
        }
      ]
    },
    "orderedProducts": [
      "89",
      "889",
      "2cbad29e-a510-52fc-bbdf-e873320e89f5"
    ],
    "orderedProductsSpecs": [
      {
        "productId": "2cbad29e-a510-52fc-bbdf-e873320e89f5",
        "status": "online",
        "statusDescription": "",
        "deliveredOn": "2020-11-30T11:00:15+0000",
        "duration": "20 days",
        "durationPeriod": {
          "range": "days",
          "period": 30
        },
        "utm": "utm_medium=social&utm_source=facebook&utm_campaign=example",
        "jobBoardLink": "http://job.ad.com/software-developer",
        "contractId": "06a8f6f0-5e0e-4614-869e-ab95a8530633",
        "postingRequirements": {
          "someText": "example",
          "multipleSelectField": [
            "123",
            "234"
          ],
          "someIntValue": 22
        }
      }
    ],
    "postings": [
      {
        "name": "Linkedin.com 30 days",
        "clicks": 14
      }
    ]
  }
}
```


# Take Campaign Offline

Specific endpoint to take a campaign offline. Keep in mind that processing this might
take some time and it only has an effect if the campaign's status is "online".

```java
CompletableFuture<TakeCampaignOfflineResponseModel> takeCampaignOfflineAsync(
    final UUID campaignId,
    final TakeCampaignOfflineRequestModel body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `campaignId` | `UUID` | Template, Required | Id of the Campaign you want to take offline |
| `body` | [`TakeCampaignOfflineRequestModel`](../../doc/models/take-campaign-offline-request-model.md) | Body, Required | - |

## Response Type

[`TakeCampaignOfflineResponseModel`](../../doc/models/take-campaign-offline-response-model.md)

## Example Usage

```java
UUID campaignId = UUID.fromString("000026a2-0000-0000-0000-000000000000");
TakeCampaignOfflineRequest body = new TakeCampaignOfflineRequest();
body.setCampaignId("ffb37e76-d4fe-5ad6-8441-b02c1b15aa4c");
body.setStatus("offline");

campaignsController.takeCampaignOfflineAsync(campaignId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "campaignId": "ffb37e76-d4fe-5ad6-8441-b02c1b15aa4c"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | - | [`TakeCampaignOfflineErrorResponse2Exception`](../../doc/models/take-campaign-offline-error-response-2-exception.md) |
| 404 | - | [`TakeCampaignOfflineErrorResponseException`](../../doc/models/take-campaign-offline-error-response-exception.md) |

