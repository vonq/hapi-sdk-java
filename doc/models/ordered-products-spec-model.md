
# Ordered Products Spec Model

## Structure

`OrderedProductsSpecModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProductId` | `List<String>` | Required | - | List<String> getProductId() | setProductId(List<String> productId) |
| `Utm` | `List<String>` | Required | - | List<String> getUtm() | setUtm(List<String> utm) |

## Example (as JSON)

```json
{
  "productId": [
    "This value should not be blank."
  ],
  "utm": [
    "This value should not be blank."
  ]
}
```

