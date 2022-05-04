# Taxonomy

```java
TaxonomyController taxonomyController = client.getTaxonomyController();
```

## Class Name

`TaxonomyController`

## Methods

* [List Industries](../../doc/controllers/taxonomy.md#list-industries)
* [Retrieve Education Levels](../../doc/controllers/taxonomy.md#retrieve-education-levels)
* [Retrieve Job Functions Tree](../../doc/controllers/taxonomy.md#retrieve-job-functions-tree)
* [Retrieve Seniorities](../../doc/controllers/taxonomy.md#retrieve-seniorities)
* [Search Job Titles](../../doc/controllers/taxonomy.md#search-job-titles)
* [Search Locations](../../doc/controllers/taxonomy.md#search-locations)


# List Industries

This endpoint returns a list of supported industry names that can be used to search for products. Results are ordered alphabetically.
Use the `id` key of any Industry in the response to search for a product.
Besides the default English, German and Dutch result translations can be requested by specifying an `Accept-Language: [de|nl]` header.

```java
CompletableFuture<List<IndustryModel>> listIndustriesAsync(
    final Double limit,
    final Double offset,
    final AcceptLanguageEnum acceptLanguage)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `limit` | `Double` | Query, Optional | Number of results to return per page. |
| `offset` | `Double` | Query, Optional | The initial index from which to return the results. |
| `acceptLanguage` | [`AcceptLanguageEnum`](../../doc/models/accept-language-enum.md) | Header, Optional | - |

## Response Type

[`List<IndustryModel>`](../../doc/models/industry-model.md)

## Example Usage

```java
AcceptLanguageEnum acceptLanguage = AcceptLanguageEnum.EN;

taxonomyController.listIndustriesAsync(null, null, acceptLanguage).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Retrieve Education Levels

Retrieve all Education Level possible values.

```java
CompletableFuture<List<EducationLevelModel>> retrieveEducationLevelsAsync()
```

## Response Type

[`List<EducationLevelModel>`](../../doc/models/education-level-model.md)

## Example Usage

```java
taxonomyController.retrieveEducationLevelsAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "id": 1,
    "name": [
      {
        "languageCode": "nl_NL",
        "value": "Master / Postdoctoraal"
      }
    ]
  }
]
```


# Retrieve Job Functions Tree

This endpoint returns a tree-like structure of supported Job Functions that can be used to search for Products.
Use the `id` key of any Job Function in the response to search for a Product.
Each Job Function is associated with [**`Job Titles`**](b3A6MzM0NDA3MzY-job-titles) in a one-to-many fashion.
Besides the default English, German and Dutch result translations can be requested by specifying an `Accept-Language: [de|nl]` header.

```java
CompletableFuture<List<JobFunctionModel>> retrieveJobFunctionsTreeAsync(
    final AcceptLanguageEnum acceptLanguage)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `acceptLanguage` | [`AcceptLanguageEnum`](../../doc/models/accept-language-enum.md) | Header, Optional | - |

## Response Type

[`List<JobFunctionModel>`](../../doc/models/job-function-model.md)

## Example Usage

```java
AcceptLanguageEnum acceptLanguage = AcceptLanguageEnum.EN;

taxonomyController.retrieveJobFunctionsTreeAsync(acceptLanguage).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "id": 8,
    "name": "Education",
    "children": [
      {
        "id": 5,
        "name": "Teaching",
        "children": []
      }
    ]
  }
]
```


# Retrieve Seniorities

Retrieve all Seniority possible values.

```java
CompletableFuture<List<SeniorityModel>> retrieveSenioritiesAsync()
```

## Response Type

[`List<SeniorityModel>`](../../doc/models/seniority-model.md)

## Example Usage

```java
taxonomyController.retrieveSenioritiesAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "id": 3,
    "name": [
      {
        "languageCode": "en_GB",
        "value": "Manager"
      }
    ]
  }
]
```


# Search Job Titles

This endpoint takes any text as input and returns a list of supported Job Titles matching the query, ordered by popularity.
Use the `id` key of each object in the response to search for a Product.
Currently, we support 4,000 job titles for each of the following languages: English, Dutch and German.
Each Job Title is associated with a [**`Job Function`**](b3A6MzM0NDA3MzU-job-functions) in a many-to-one fashion.
Besides the default English, German and Dutch result translations can be requested by specifying an `Accept-Language: [de|nl]` header.

```java
CompletableFuture<List<JobTitleModel>> searchJobTitlesAsync(
    final String text,
    final Double limit,
    final Double offset,
    final AcceptLanguageEnum acceptLanguage)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `text` | `String` | Query, Required | Search text for a job title name |
| `limit` | `Double` | Query, Optional | Number of results to return per page. |
| `offset` | `Double` | Query, Optional | The initial index from which to return the results. |
| `acceptLanguage` | [`AcceptLanguageEnum`](../../doc/models/accept-language-enum.md) | Header, Optional | - |

## Response Type

[`List<JobTitleModel>`](../../doc/models/job-title-model.md)

## Example Usage

```java
String text = "text0";
AcceptLanguageEnum acceptLanguage = AcceptLanguageEnum.EN;

taxonomyController.searchJobTitlesAsync(text, null, null, acceptLanguage).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Search Locations

This endpoint takes any text as input and returns a list of Locations matching the query, ordered by popularity.
Each response will include the entire world as a Location, even no Locations match the text query.
Use the `id` key of each object in the response to search for a Product.
Supports text input in English, Dutch and German.

```java
CompletableFuture<List<LocationModel>> searchLocationsAsync(
    final String text)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `text` | `String` | Query, Required | Search text for a location name in either English, Dutch, German, French and Italian. Partial recognition of 20 other languages. |

## Response Type

[`List<LocationModel>`](../../doc/models/location-model.md)

## Example Usage

```java
String text = "text0";

taxonomyController.searchLocationsAsync(text).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

