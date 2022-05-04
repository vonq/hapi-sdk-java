
# Campaign Status Model

## Structure

`CampaignStatusModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CampaignId` | `String` | Required | - | String getCampaignId() | setCampaignId(String campaignId) |
| `Status` | [`StatusEnum`](../../doc/models/status-enum.md) | Optional | Status of the campaign. One of the following | StatusEnum getStatus() | setStatus(StatusEnum status) |
| `OrderedProductsStatuses` | [`List<OrderedProductsStatusItemModel>`](../../doc/models/ordered-products-status-item-model.md) | Optional | - | List<OrderedProductsStatusItemModel> getOrderedProductsStatuses() | setOrderedProductsStatuses(List<OrderedProductsStatusItemModel> orderedProductsStatuses) |

## Example (as JSON)

```json
{
  "campaignId": "dd1c5be0-b0e1-41c8-ba92-e876da16c38b"
}
```

