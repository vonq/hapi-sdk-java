
# Create Contract Response Model

## Structure

`CreateContractResponseModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CustomerId` | `String` | Required | - | String getCustomerId() | setCustomerId(String customerId) |
| `ContractId` | `String` | Required | - | String getContractId() | setContractId(String contractId) |
| `ChannelId` | `int` | Required | - | int getChannelId() | setChannelId(int channelId) |
| `Credentials` | `String` | Required | - | String getCredentials() | setCredentials(String credentials) |
| `ClassName` | `String` | Required | - | String getClassName() | setClassName(String className) |
| `Facets` | `Object` | Required | - | Object getFacets() | setFacets(Object facets) |
| `Product` | [`ProductLiteModel`](../../doc/models/product-lite-model.md) | Required | - | ProductLiteModel getProduct() | setProduct(ProductLiteModel product) |
| `PostingRequirements` | `String` | Required | - | String getPostingRequirements() | setPostingRequirements(String postingRequirements) |
| `ExpiryDate` | `LocalDateTime` | Optional | - | LocalDateTime getExpiryDate() | setExpiryDate(LocalDateTime expiryDate) |
| `Credits` | `Integer` | Optional | - | Integer getCredits() | setCredits(Integer credits) |
| `PurchasePrice` | [`PurchasePriceModel`](../../doc/models/purchase-price-model.md) | Optional | - | PurchasePriceModel getPurchasePrice() | setPurchasePrice(PurchasePriceModel purchasePrice) |

## Example (as JSON)

```json
{
  "customer_id": "76e124d4-ae69-4753-bede-259d505258b7",
  "contract_id": "3a283b8f-1670-404b-b804-92f67e66b71c",
  "channel_id": 13,
  "credentials": "",
  "class_name": "",
  "facets": {},
  "product": {
    "product_id": "2e8c3c17-179b-4db1-9e2b-d48369b5e409",
    "title": "product title"
  },
  "posting_requirements": ""
}
```

