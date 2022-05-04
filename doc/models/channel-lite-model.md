
# Channel Lite Model

## Structure

`ChannelLiteModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `McEnabled` | `boolean` | Required | - | boolean getMcEnabled() | setMcEnabled(boolean mcEnabled) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Name` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getName() | setName(String name) |
| `Url` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getUrl() | setUrl(String url) |
| `Type` | `String` | Required | **Constraints**: *Minimum Length*: `1` | String getType() | setType(String type) |

## Example (as JSON)

```json
{
  "mc_enabled": false,
  "id": 112,
  "name": "name0",
  "url": "url4",
  "type": "type0"
}
```

