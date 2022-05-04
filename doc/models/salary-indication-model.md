
# Salary Indication Model

## Structure

`SalaryIndicationModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Period` | `List<String>` | Required | - | List<String> getPeriod() | setPeriod(List<String> period) |
| `Range` | [`Range4Model`](../../doc/models/range-4-model.md) | Required | - | Range4Model getRange() | setRange(Range4Model range) |

## Example (as JSON)

```json
{
  "period": [
    "A SalaryIndication needs a period"
  ],
  "range": {
    "to": [
      "This value should not be blank."
    ]
  }
}
```

