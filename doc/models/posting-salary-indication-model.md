
# Posting Salary Indication Model

## Structure

`PostingSalaryIndicationModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Period` | [`PeriodEnum`](../../doc/models/period-enum.md) | Required | - | PeriodEnum getPeriod() | setPeriod(PeriodEnum period) |
| `Range` | [`Range3Model`](../../doc/models/range-3-model.md) | Required | - | Range3Model getRange() | setRange(Range3Model range) |

## Example (as JSON)

```json
{
  "period": "yearly",
  "range": {
    "to": 60000
  }
}
```

