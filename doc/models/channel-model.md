
# Channel Model

## Structure

`ChannelModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The name of a channel | String getName() | setName(String name) |
| `Url` | `String` | Required | The url of a channel | String getUrl() | setUrl(String url) |
| `Type` | [`ChannelTypeEnum`](../../doc/models/channel-type-enum.md) | Required | The type of a channel | ChannelTypeEnum getType() | setType(ChannelTypeEnum type) |
| `McEnabled` | `boolean` | Required | Does a channel support My Contracts | boolean getMcEnabled() | setMcEnabled(boolean mcEnabled) |
| `ContractCredentials` | [`List<ContractCredentialModel>`](../../doc/models/contract-credential-model.md) | Required | - | List<ContractCredentialModel> getContractCredentials() | setContractCredentials(List<ContractCredentialModel> contractCredentials) |
| `ContractFacets` | `List<Object>` | Required | - | List<Object> getContractFacets() | setContractFacets(List<Object> contractFacets) |
| `PostingRequirements` | [`List<FacetModel>`](../../doc/models/facet-model.md) | Required | Dynamic posting requirements for MC products, used to provide additional data with vacancies | List<FacetModel> getPostingRequirements() | setPostingRequirements(List<FacetModel> postingRequirements) |
| `ManualSetupRequired` | `boolean` | Required | Some Channels require manual setup done by the end-user. In most such cases, `setup_instructions` should contain HTML | boolean getManualSetupRequired() | setManualSetupRequired(boolean manualSetupRequired) |
| `SetupInstructions` | `String` | Required | Additional setup instructions required to post on the Channel | String getSetupInstructions() | setSetupInstructions(String setupInstructions) |
| `FeedUrl` | `String` | Required | Some channels like apec.fr require the user to send the job board an XML url. If not null, this value should be displayed to the user, along with the `setup_instructions` | String getFeedUrl() | setFeedUrl(String feedUrl) |

## Example (as JSON)

```json
{
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
}
```

