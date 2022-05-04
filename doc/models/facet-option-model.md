
# Facet Option Model

## Structure

`FacetOptionModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Default` | `String` | Required | Whether the option should be the default choice when rendering the SELECT. | String getDefault() | setDefault(String mDefault) |
| `Key` | `String` | Required | The value to be used when setting the value of the facet when this option is selected. | String getKey() | setKey(String key) |
| `Label` | `String` | Required | The option's user-friendly label | String getLabel() | setLabel(String label) |
| `Sort` | `String` | Required | The order of the option in the list of options. lower value means higher rank. | String getSort() | setSort(String sort) |
| `Show` | [`List<FacetOptionShowFacetsModel>`](../../doc/models/facet-option-show-facets-model.md) | Optional | References to Facets that becomes required when this option is selected | List<FacetOptionShowFacetsModel> getShow() | setShow(List<FacetOptionShowFacetsModel> show) |

## Example (as JSON)

```json
{
  "default": "default0",
  "key": "key0",
  "label": "label0",
  "sort": "sort8",
  "show": null
}
```

