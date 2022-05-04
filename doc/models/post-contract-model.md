
# Post Contract Model

## Structure

`PostContractModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ChannelId` | `double` | Required | - | double getChannelId() | setChannelId(double channelId) |
| `Credentials` | `Object` | Required | An object with credentials data | Object getCredentials() | setCredentials(Object credentials) |
| `Facets` | `Object` | Optional | An object with product parameters | Object getFacets() | setFacets(Object facets) |
| `FollowedInstructions` | `Boolean` | Optional | When creating contracts for Channels that require the end-user to follow instructions (based on the `manual_setup_required` key in the response body for the [Retrieve details for channel with support for contracts](https://vonq.stoplight.io/docs/hapi/b3A6NTUxMjYwODI-retrieve-details-for-channel-with-support-for-contracts) endpoint), set this value to `true` to confirm the user has done so. For quality purposes, setting this field to `true` for Channels that don't require following instructions will result in a 400 Bad Request. | Boolean getFollowedInstructions() | setFollowedInstructions(Boolean followedInstructions) |
| `ExpiryDate` | `LocalDateTime` | Optional | - | LocalDateTime getExpiryDate() | setExpiryDate(LocalDateTime expiryDate) |
| `Credits` | `Double` | Optional | - | Double getCredits() | setCredits(Double credits) |
| `PurchasePrice` | [`ContractPurchasePriceModel`](../../doc/models/contract-purchase-price-model.md) | Optional | - | ContractPurchasePriceModel getPurchasePrice() | setPurchasePrice(ContractPurchasePriceModel purchasePrice) |

## Example (as JSON)

```json
{
  "channel_id": 0,
  "credentials": null
}
```

