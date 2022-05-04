
# Price Model

## Structure

`PriceModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `Double` | Optional | Price amount in specified currency and 2 decimal places | Double getAmount() | setAmount(Double amount) |
| `Currency` | [`CurrencyEnum`](../../doc/models/currency-enum.md) | Optional | ISO 4217 code for the Currency. | CurrencyEnum getCurrency() | setCurrency(CurrencyEnum currency) |

## Example (as JSON)

```json
{
  "amount": null,
  "currency": null
}
```

