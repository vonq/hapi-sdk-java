
# Recruiter Info Model

Recruiter is the user creating the campaign and you may want to use this to provide filtering by recruiter for groups sharing an account.

## Structure

`RecruiterInfoModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | A vendor-related unique identification for the Recruiter | String getId() | setId(String id) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `EmailAddress` | `String` | Optional | - | String getEmailAddress() | setEmailAddress(String emailAddress) |

## Example (as JSON)

```json
{
  "name": "John Doe"
}
```

