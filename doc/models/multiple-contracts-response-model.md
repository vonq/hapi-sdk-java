
# Multiple Contracts Response Model

## Structure

`MultipleContractsResponseModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Count` | `Double` | Optional | count of elements in results | Double getCount() | setCount(Double count) |
| `Previous` | `String` | Optional | link to get previous results | String getPrevious() | setPrevious(String previous) |
| `Next` | `String` | Optional | link to get next results | String getNext() | setNext(String next) |
| `Results` | [`List<ContractModel>`](../../doc/models/contract-model.md) | Optional | - | List<ContractModel> getResults() | setResults(List<ContractModel> results) |

## Example (as JSON)

```json
{
  "count": null,
  "previous": null,
  "next": null,
  "results": null
}
```

