
# Ordered Products Status Item Model

## Structure

`OrderedProductsStatusItemModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProductId` | `String` | Optional | - | String getProductId() | setProductId(String productId) |
| `Status` | [`ChannelStatusEnum`](../../doc/models/channel-status-enum.md) | Optional | Status of the product. One of the following | ChannelStatusEnum getStatus() | setStatus(ChannelStatusEnum status) |
| `StatusDescription` | `String` | Optional | Additional information about product status | String getStatusDescription() | setStatusDescription(String statusDescription) |

## Example (as JSON)

```json
{
  "productId": null,
  "status": null,
  "statusDescription": null
}
```

