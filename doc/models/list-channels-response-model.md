
# List Channels Response Model

## Structure

`ListChannelsResponseModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Count` | `int` | Required | - | int getCount() | setCount(int count) |
| `Next` | `String` | Required | - | String getNext() | setNext(String next) |
| `Previous` | `String` | Required | - | String getPrevious() | setPrevious(String previous) |
| `Results` | [`List<ChannelLiteModel>`](../../doc/models/channel-lite-model.md) | Required | - | List<ChannelLiteModel> getResults() | setResults(List<ChannelLiteModel> results) |

## Example (as JSON)

```json
{
  "count": 60,
  "next": "next2",
  "previous": "previous8",
  "results": [
    {
      "mc_enabled": true,
      "id": 29,
      "name": "name3",
      "url": "url7",
      "type": "type7"
    }
  ]
}
```

