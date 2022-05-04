
# Posting Organization Model

## Structure

`PostingOrganizationModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Name of the Company | String getName() | setName(String name) |
| `CompanyLogo` | `String` | Required | The company Logo that wants to be used on the posting. It has to be publicly available so it's picked up<br>and used for the different publishing platforms | String getCompanyLogo() | setCompanyLogo(String companyLogo) |

## Example (as JSON)

```json
{
  "name": "Vonq",
  "companyLogo": "http://static.ats.com/public/vonq-company-logo.png"
}
```

