
# Job Function Tree Model

## Structure

`JobFunctionTreeModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `double` | Required | - | double getId() | setId(double id) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Children` | [`List<JobFunctionTreeModel>`](../../doc/models/job-function-tree-model.md) | Required | - | List<JobFunctionTreeModel> getChildren() | setChildren(List<JobFunctionTreeModel> children) |

## Example (as JSON)

```json
{
  "id": 60.0,
  "name": "name0",
  "children": [
    {
      "id": 128.74,
      "name": "name4",
      "children": {
        "id": 128.74,
        "name": "name4",
        "children": null
      }
    },
    {
      "id": 128.75,
      "name": "name5",
      "children": {
        "id": 128.73,
        "name": "name3",
        "children": null
      }
    }
  ]
}
```

