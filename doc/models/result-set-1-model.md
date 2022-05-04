
# Result Set 1 Model

## Structure

`ResultSet1Model`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Total` | `Double` | Optional | Number of total results | Double getTotal() | setTotal(Double total) |
| `Limit` | `Double` | Optional | Results page size | Double getLimit() | setLimit(Double limit) |
| `Offset` | `Double` | Optional | Initial starting index for the results | Double getOffset() | setOffset(Double offset) |
| `Data` | [`List<CampaignModel>`](../../doc/models/campaign-model.md) | Optional | A Page of Campaign Objects | List<CampaignModel> getData() | setData(List<CampaignModel> data) |

## Example (as JSON)

```json
{
  "total": null,
  "limit": null,
  "offset": null,
  "data": null
}
```

