
# Target Group Model

## Structure

`TargetGroupModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EducationLevel` | [`List<TargetGroupElementModel>`](../../doc/models/target-group-element-model.md) | Required | Education Level required by the Candidate. You can specify only one value. | List<TargetGroupElementModel> getEducationLevel() | setEducationLevel(List<TargetGroupElementModel> educationLevel) |
| `Seniority` | [`List<TargetGroupElementModel>`](../../doc/models/target-group-element-model.md) | Required | Seniority Level expected by the Candidate. You can specify only one value. | List<TargetGroupElementModel> getSeniority() | setSeniority(List<TargetGroupElementModel> seniority) |
| `Industry` | [`List<TargetGroupElementModel>`](../../doc/models/target-group-element-model.md) | Required | The Industry related to the Position open. You can specify only one value. | List<TargetGroupElementModel> getIndustry() | setIndustry(List<TargetGroupElementModel> industry) |
| `JobCategory` | [`List<TargetGroupElementModel>`](../../doc/models/target-group-element-model.md) | Required | Job Category indicates the type of Position that's open. You can specify only one value. | List<TargetGroupElementModel> getJobCategory() | setJobCategory(List<TargetGroupElementModel> jobCategory) |

## Example (as JSON)

```json
{
  "educationLevel": {
    "description": "Element name",
    "vonqId": "23"
  },
  "seniority": {
    "description": "Element name",
    "vonqId": "23"
  },
  "industry": {
    "description": "Element name",
    "vonqId": "23"
  },
  "jobCategory": {
    "description": "Element name",
    "vonqId": "23"
  }
}
```

