
# Posting Working Location Model

## Structure

`PostingWorkingLocationModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AddressLine1` | `String` | Required | - | String getAddressLine1() | setAddressLine1(String addressLine1) |
| `AddressLine2` | `String` | Optional | - | String getAddressLine2() | setAddressLine2(String addressLine2) |
| `Postcode` | `String` | Required | - | String getPostcode() | setPostcode(String postcode) |
| `City` | `String` | Required | - | String getCity() | setCity(String city) |
| `Country` | `String` | Required | - | String getCountry() | setCountry(String country) |
| `AllowsRemoteWork` | `Double` | Optional | Optional parameter allowing remote work, possible values are 0 and 1, defaults to 0 | Double getAllowsRemoteWork() | setAllowsRemoteWork(Double allowsRemoteWork) |

## Example (as JSON)

```json
{
  "addressLine1": "Westblaak 175",
  "postcode": "3012 KJ",
  "city": "Rotterdam",
  "country": "The Netherlands"
}
```

