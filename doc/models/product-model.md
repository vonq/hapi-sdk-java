
# Product Model

## Structure

`ProductModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Title` | `String` | Required | - | String getTitle() | setTitle(String title) |
| `Locations` | [`List<LocationModel>`](../../doc/models/location-model.md) | Required | **Constraints**: *Unique Items Required* | List<LocationModel> getLocations() | setLocations(List<LocationModel> locations) |
| `JobFunctions` | [`List<JobFunctionModel>`](../../doc/models/job-function-model.md) | Required | **Constraints**: *Unique Items Required* | List<JobFunctionModel> getJobFunctions() | setJobFunctions(List<JobFunctionModel> jobFunctions) |
| `Industries` | [`List<IndustryModel>`](../../doc/models/industry-model.md) | Required | **Constraints**: *Unique Items Required* | List<IndustryModel> getIndustries() | setIndustries(List<IndustryModel> industries) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Homepage` | `String` | Required | - | String getHomepage() | setHomepage(String homepage) |
| `LogoUrl` | `String` | Required | - | String getLogoUrl() | setLogoUrl(String logoUrl) |
| `LogoSquareUrl` | `String` | Required | - | String getLogoSquareUrl() | setLogoSquareUrl(String logoSquareUrl) |
| `LogoRectangleUrl` | `String` | Required | - | String getLogoRectangleUrl() | setLogoRectangleUrl(String logoRectangleUrl) |
| `Duration` | `Object` | Required | - | Object getDuration() | setDuration(Object duration) |
| `TimeToProcess` | [`TimeToProcessModel`](../../doc/models/time-to-process-model.md) | Required | - | TimeToProcessModel getTimeToProcess() | setTimeToProcess(TimeToProcessModel timeToProcess) |
| `TimeToSetup` | [`TimeToSetupModel`](../../doc/models/time-to-setup-model.md) | Required | - | TimeToSetupModel getTimeToSetup() | setTimeToSetup(TimeToSetupModel timeToSetup) |
| `ProductId` | `UUID` | Required | - | UUID getProductId() | setProductId(UUID productId) |
| `VonqPrice` | [`List<PriceModel>`](../../doc/models/price-model.md) | Required | the price to be displayed to customers | List<PriceModel> getVonqPrice() | setVonqPrice(List<PriceModel> vonqPrice) |
| `RatecardPrice` | [`List<PriceModel>`](../../doc/models/price-model.md) | Required | - | List<PriceModel> getRatecardPrice() | setRatecardPrice(List<PriceModel> ratecardPrice) |
| `Type` | [`ChannelTypeEnum`](../../doc/models/channel-type-enum.md) | Required | The type of a channel | ChannelTypeEnum getType() | setType(ChannelTypeEnum type) |
| `CrossPostings` | `List<String>` | Required | - | List<String> getCrossPostings() | setCrossPostings(List<String> crossPostings) |
| `Channel` | [`ChannelModel`](../../doc/models/channel-model.md) | Required | - | ChannelModel getChannel() | setChannel(ChannelModel channel) |
| `AudienceGroup` | [`AudienceGroupEnum`](../../doc/models/audience-group-enum.md) | Required | The product's audience group (niche/generic) | AudienceGroupEnum getAudienceGroup() | setAudienceGroup(AudienceGroupEnum audienceGroup) |
| `McEnabled` | `boolean` | Required | is My Contract enabled for the channel | boolean getMcEnabled() | setMcEnabled(boolean mcEnabled) |
| `McOnly` | `boolean` | Required | is the product available only for My Contract order | boolean getMcOnly() | setMcOnly(boolean mcOnly) |
| `AllowOrders` | `boolean` | Required | is the product available for order. a campaign cannot be ordered with a product having `allow_orders` set to `false`. | boolean getAllowOrders() | setAllowOrders(boolean allowOrders) |

## Example (as JSON)

```json
{
  "title": null,
  "locations": {
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
  },
  "job_functions": null,
  "industries": null,
  "description": "this is a product description",
  "homepage": null,
  "logo_url": null,
  "logo_square_url": null,
  "logo_rectangle_url": null,
  "duration": null,
  "time_to_process": null,
  "time_to_setup": null,
  "product_id": null,
  "vonq_price": null,
  "ratecard_price": null,
  "type": "job board",
  "cross_postings": null,
  "channel": {
    "name": "Linkedin",
    "url": "www.linkedin.com",
    "type": "job board",
    "mc_enabled": false,
    "contract_credentials": null,
    "contract_facets": null,
    "posting_requirements": {
      "name": null,
      "label": null,
      "sort": null,
      "required": null,
      "type": "AUTOCOMPLETE",
      "options": null,
      "autocomplete": null
    },
    "manual_setup_required": null,
    "setup_instructions": null,
    "feed_url": null
  },
  "audience_group": null,
  "mc_enabled": null,
  "mc_only": null,
  "allow_orders": null
}
```

