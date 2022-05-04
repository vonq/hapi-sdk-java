
# Posting Details Errors Model

## Structure

`PostingDetailsErrorsModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Title` | `List<String>` | Required | - | List<String> getTitle() | setTitle(List<String> title) |
| `Description` | `List<String>` | Required | - | List<String> getDescription() | setDescription(List<String> description) |
| `YearsOfExperience` | `List<String>` | Required | - | List<String> getYearsOfExperience() | setYearsOfExperience(List<String> yearsOfExperience) |
| `EmploymentType` | `List<String>` | Required | - | List<String> getEmploymentType() | setEmploymentType(List<String> employmentType) |
| `Organization` | [`OrganizationModel`](../../doc/models/organization-model.md) | Required | - | OrganizationModel getOrganization() | setOrganization(OrganizationModel organization) |
| `WorkingLocation` | [`WorkingLocationModel`](../../doc/models/working-location-model.md) | Required | - | WorkingLocationModel getWorkingLocation() | setWorkingLocation(WorkingLocationModel workingLocation) |
| `WeeklyWorkingHours` | [`WeeklyWorkingHoursModel`](../../doc/models/weekly-working-hours-model.md) | Required | - | WeeklyWorkingHoursModel getWeeklyWorkingHours() | setWeeklyWorkingHours(WeeklyWorkingHoursModel weeklyWorkingHours) |
| `SalaryIndication` | [`SalaryIndicationModel`](../../doc/models/salary-indication-model.md) | Required | - | SalaryIndicationModel getSalaryIndication() | setSalaryIndication(SalaryIndicationModel salaryIndication) |
| `JobPageUrl` | `List<String>` | Required | - | List<String> getJobPageUrl() | setJobPageUrl(List<String> jobPageUrl) |
| `ApplicationUrl` | `List<String>` | Required | - | List<String> getApplicationUrl() | setApplicationUrl(List<String> applicationUrl) |

## Example (as JSON)

```json
{
  "title": [
    "A Title of the Posting is required"
  ],
  "description": [
    "A Description of the Posting is required"
  ],
  "yearsOfExperience": [
    "This value should not be blank."
  ],
  "employmentType": [
    "A Posting needs a type of employment"
  ],
  "organization": {
    "name": [
      "This value should not be blank."
    ],
    "companyLogo": [
      "This value should not be blank."
    ]
  },
  "workingLocation": {
    "addressLine1": [
      "This value should not be blank."
    ],
    "postcode": [
      "This value should not be blank."
    ],
    "city": [
      "This value should not be blank."
    ],
    "country": [
      "This value should not be blank."
    ]
  },
  "weeklyWorkingHours": {
    "to": [
      "This value should not be blank."
    ]
  },
  "salaryIndication": {
    "period": [
      "A SalaryIndication needs a period"
    ],
    "range": {
      "to": [
        "This value should not be blank."
      ]
    }
  },
  "jobPageUrl": [
    "This value should not be blank."
  ],
  "applicationUrl": [
    "This value should not be blank."
  ]
}
```

