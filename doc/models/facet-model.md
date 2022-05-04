
# Facet Model

## Structure

`FacetModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The name of the Facet. To be used as a key when ordering a Campaign, under the `orderedProductsSpecs.postingRequirements` key. | String getName() | setName(String name) |
| `Label` | `String` | Required | The user facing label | String getLabel() | setLabel(String label) |
| `Sort` | `String` | Required | The order in the list of vacancy fields to be displayed to the user when posting. Facets with lower `sort` values should be displayed first. | String getSort() | setSort(String sort) |
| `Required` | `boolean` | Required | Whether the Facet is required when ordering a Campaign. | boolean getRequired() | setRequired(boolean required) |
| `Type` | [`TypeEnum`](../../doc/models/type-enum.md) | Required | The type of UI and data structure to be used to input and store values for this Facet. | TypeEnum getType() | setType(TypeEnum type) |
| `Options` | [`List<FacetOptionModel>`](../../doc/models/facet-option-model.md) | Required | list of choices for this Facet's value. | List<FacetOptionModel> getOptions() | setOptions(List<FacetOptionModel> options) |
| `Rules` | [`List<FacetRuleModel>`](../../doc/models/facet-rule-model.md) | Optional | special validation rules that apply for this Facet's value | List<FacetRuleModel> getRules() | setRules(List<FacetRuleModel> rules) |
| `Autocomplete` | [`AutocompleteModel`](../../doc/models/autocomplete-model.md) | Required | Used for Facets whose value choices need to be fetched through an additional call to the [List autocomplete values for posting requirements](https://vonq.stoplight.io/docs/hapi/b3A6MzM2MDEzODk-list-autocomplete-values-for-posting-requirement) endpoint. | AutocompleteModel getAutocomplete() | setAutocomplete(AutocompleteModel autocomplete) |

## Example (as JSON)

```json
{
  "name": null,
  "label": null,
  "sort": null,
  "required": null,
  "type": "AUTOCOMPLETE",
  "options": null,
  "autocomplete": null
}
```

