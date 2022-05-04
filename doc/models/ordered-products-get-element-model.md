
# Ordered Products Get Element Model

## Structure

`OrderedProductsGetElementModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProductId` | `String` | Optional | Product Identification | String getProductId() | setProductId(String productId) |
| `Status` | `String` | Optional | Status per product | String getStatus() | setStatus(String status) |
| `StatusDescription` | `String` | Optional | Status description, additional status information | String getStatusDescription() | setStatusDescription(String statusDescription) |
| `DeliveredOn` | `String` | Optional | Date when the channel went online | String getDeliveredOn() | setDeliveredOn(String deliveredOn) |
| `Duration` | `String` | Optional | How long will the `Product` be online. [DEPRECATED] please instead use the `durationPeriod` | String getDuration() | setDuration(String duration) |
| `DurationPeriod` | [`DurationModel`](../../doc/models/duration-model.md) | Optional | - | DurationModel getDurationPeriod() | setDurationPeriod(DurationModel durationPeriod) |
| `Utm` | `String` | Optional | Tracking codes | String getUtm() | setUtm(String utm) |
| `JobBoardLink` | `String` | Optional | Link to the job ad on the channel. Sometimes this link is not available from a job board, then the product homepage is returned. | String getJobBoardLink() | setJobBoardLink(String jobBoardLink) |
| `ContractId` | `String` | Optional | Contract Identifier for My Contracts product | String getContractId() | setContractId(String contractId) |
| `PostingRequirements` | [`PostingRequirementsModel`](../../doc/models/posting-requirements-model.md) | Optional | - | PostingRequirementsModel getPostingRequirements() | setPostingRequirements(PostingRequirementsModel postingRequirements) |

## Example (as JSON)

```json
{
  "productId": null,
  "status": null,
  "statusDescription": null,
  "deliveredOn": null,
  "duration": null,
  "durationPeriod": null,
  "utm": null,
  "jobBoardLink": null,
  "contractId": null,
  "postingRequirements": null
}
```

