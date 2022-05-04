
# Contract Model

## Structure

`ContractModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ContractId` | `String` | Required | The identifier of the Contract. To be used when creating a Campaign | String getContractId() | setContractId(String contractId) |
| `CustomerId` | `String` | Required | The customer_id this contract belongs to. Based on the original `X-Customer-Id` header used when the contract was created. | String getCustomerId() | setCustomerId(String customerId) |
| `ChannelId` | `double` | Required | The Channel (job board) the contract is to be used for | double getChannelId() | setChannelId(double channelId) |
| `Credentials` | `Object` | Required | AES Encrypted credentials | Object getCredentials() | setCredentials(Object credentials) |
| `ClassName` | `String` | Required | Channel slug | String getClassName() | setClassName(String className) |
| `Facets` | `Object` | Required | An object with contract parameters | Object getFacets() | setFacets(Object facets) |
| `Product` | [`ContractProductModel`](../../doc/models/contract-product-model.md) | Required | The Product to be used in combination with the Contract when ordering a Campaign. | ContractProductModel getProduct() | setProduct(ContractProductModel product) |
| `PostingRequirements` | [`List<FacetModel>`](../../doc/models/facet-model.md) | Required | A list of the Contract Channel's Facets | List<FacetModel> getPostingRequirements() | setPostingRequirements(List<FacetModel> postingRequirements) |
| `ExpiryDate` | `LocalDateTime` | Required | - | LocalDateTime getExpiryDate() | setExpiryDate(LocalDateTime expiryDate) |
| `Credits` | `Double` | Required | - | Double getCredits() | setCredits(Double credits) |
| `PurchasePrice` | [`ContractPurchasePriceModel`](../../doc/models/contract-purchase-price-model.md) | Optional | - | ContractPurchasePriceModel getPurchasePrice() | setPurchasePrice(ContractPurchasePriceModel purchasePrice) |

## Example (as JSON)

```json
{
  "contract_id": "06a8f6f0-5e0e-4614-869e-ab95a8530633",
  "customer_id": "c0cbefa5-6f04-4dbc-8208-5963bc433166",
  "channel_id": 0,
  "credentials": null,
  "class_name": null,
  "facets": null,
  "product": null,
  "posting_requirements": {
    "name": null,
    "label": null,
    "sort": null,
    "required": null,
    "type": "AUTOCOMPLETE",
    "options": null,
    "autocomplete": null
  },
  "expiry_date": "02/15/2022 12:03:45",
  "credits": 0
}
```

