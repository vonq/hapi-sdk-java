
# Location Model

Location(id, canonical_name, desq_name_en, desq_country_code, country_code, mapbox_id, mapbox_text, mapbox_placename, mapbox_context, mapbox_place_type, mapbox_shortcode, mapbox_within)

## Structure

`LocationModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `double` | Required | - | double getId() | setId(double id) |
| `FullyQualifiedPlaceName` | `String` | Required | - | String getFullyQualifiedPlaceName() | setFullyQualifiedPlaceName(String fullyQualifiedPlaceName) |
| `CanonicalName` | `String` | Required | - | String getCanonicalName() | setCanonicalName(String canonicalName) |
| `BoundingBox` | `List<Double>` | Required | - | List<Double> getBoundingBox() | setBoundingBox(List<Double> boundingBox) |
| `Area` | `double` | Required | - | double getArea() | setArea(double area) |
| `PlaceType` | [`PlaceTypeEnum`](../../doc/models/place-type-enum.md) | Required | - | PlaceTypeEnum getPlaceType() | setPlaceType(PlaceTypeEnum placeType) |
| `Within` | [`LocationModel`](../../doc/models/location-model.md) | Required | - | LocationModel getWithin() | setWithin(LocationModel within) |

## Example (as JSON)

```json
{
  "id": null,
  "fully_qualified_place_name": null,
  "canonical_name": null,
  "bounding_box": null,
  "area": null,
  "place_type": "place",
  "within": {
    "id": null,
    "fully_qualified_place_name": null,
    "canonical_name": null,
    "bounding_box": null,
    "area": null,
    "place_type": "place",
    "within": null
  }
}
```

