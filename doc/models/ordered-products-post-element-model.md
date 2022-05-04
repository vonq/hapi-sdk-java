
# Ordered Products Post Element Model

## Structure

`OrderedProductsPostElementModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProductId` | `String` | Optional | Product Identification | String getProductId() | setProductId(String productId) |
| `Utm` | `String` | Optional | Query string for UTM parameters<br><br>**Pattern:** `/^([%.-_!*a-zA-Z0-9]{1,}=[%.-_!*+,;$()a-zA-Z0-9]{1,}[&]{0,}){1,}$/` | String getUtm() | setUtm(String utm) |
| `ContractId` | `String` | Optional | Contract Identifier needed for My Contracts product | String getContractId() | setContractId(String contractId) |
| `PostingRequirements` | [`PostingRequirementsModel`](../../doc/models/posting-requirements-model.md) | Optional | - | PostingRequirementsModel getPostingRequirements() | setPostingRequirements(PostingRequirementsModel postingRequirements) |

## Example (as JSON)

```json
{
  "productId": null,
  "utm": null,
  "contractId": null,
  "postingRequirements": null
}
```

