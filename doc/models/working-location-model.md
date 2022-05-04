
# Working Location Model

## Structure

`WorkingLocationModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AddressLine1` | `List<String>` | Required | - | List<String> getAddressLine1() | setAddressLine1(List<String> addressLine1) |
| `Postcode` | `List<String>` | Required | - | List<String> getPostcode() | setPostcode(List<String> postcode) |
| `City` | `List<String>` | Required | - | List<String> getCity() | setCity(List<String> city) |
| `Country` | `List<String>` | Required | - | List<String> getCountry() | setCountry(List<String> country) |

## Example (as JSON)

```json
{
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
}
```

