
# Facet Rule Model

## Structure

`FacetRuleModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Rule` | [`RuleEnum`](../../doc/models/rule-enum.md) | Required | - | RuleEnum getRule() | setRule(RuleEnum rule) |
| `Data` | `String` | Required | the value used for the rule | String getData() | setData(String data) |

## Example (as JSON)

```json
{
  "rule": "date",
  "data": null
}
```

