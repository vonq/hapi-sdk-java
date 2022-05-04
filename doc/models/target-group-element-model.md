
# Target Group Element Model

## Structure

`TargetGroupElementModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Required | The vonq name for this target group element | String getDescription() | setDescription(String description) |
| `VonqId` | `String` | Required | The Vonq ID representing this concept, as indicated in the [**`Taxonomy Endpoints`**](#reference/experimental-products-search) | String getVonqId() | setVonqId(String vonqId) |

## Example (as JSON)

```json
{
  "description": "Element name",
  "vonqId": "23"
}
```

