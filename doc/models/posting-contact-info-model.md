
# Posting Contact Info Model

Contact is whom to contact about the job. This may be part of the posting info for candidates to know whom they can reach out to learn more about the vacancy.

## Structure

`PostingContactInfoModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `PhoneNumber` | `String` | Optional | - | String getPhoneNumber() | setPhoneNumber(String phoneNumber) |
| `EmailAddress` | `String` | Optional | - | String getEmailAddress() | setEmailAddress(String emailAddress) |

## Example (as JSON)

```json
{
  "name": "Janet Doe"
}
```

