
# Range 3 Model

## Structure

`Range3Model`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `From` | `Double` | Optional | Minimum salary indication of the indicated period, if given, cannot be greater<br><br>than 'to', but equal to 'to' is allowed. This integer value should be specified in units (not cents). | Double getFrom() | setFrom(Double from) |
| `To` | `double` | Required | Maximum salary indication of the indicated period. This integer value should be specified in units (not cents). | double getTo() | setTo(double to) |
| `Currency` | `String` | Optional | The currency in which the range amount is expressed. Must be a valid ISO-4217 value. | String getCurrency() | setCurrency(String currency) |

## Example (as JSON)

```json
{
  "to": 60000
}
```

