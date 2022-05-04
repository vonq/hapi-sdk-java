/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for TargetGroupModel type.
 */
public class TargetGroupModel
        extends BaseModel {
    private List<TargetGroupElementModel> educationLevel;
    private List<TargetGroupElementModel> seniority;
    private List<TargetGroupElementModel> industry;
    private List<TargetGroupElementModel> jobCategory;

    /**
     * Default constructor.
     */
    public TargetGroupModel() {
    }

    /**
     * Initialization constructor.
     * @param  educationLevel  List of TargetGroupElementModel value for educationLevel.
     * @param  seniority  List of TargetGroupElementModel value for seniority.
     * @param  industry  List of TargetGroupElementModel value for industry.
     * @param  jobCategory  List of TargetGroupElementModel value for jobCategory.
     */
    public TargetGroupModel(
            List<TargetGroupElementModel> educationLevel,
            List<TargetGroupElementModel> seniority,
            List<TargetGroupElementModel> industry,
            List<TargetGroupElementModel> jobCategory) {
        this.educationLevel = educationLevel;
        this.seniority = seniority;
        this.industry = industry;
        this.jobCategory = jobCategory;
    }

    /**
     * Getter for EducationLevel.
     * Education Level required by the Candidate. You can specify only one value.
     * @return Returns the List of TargetGroupElementModel
     */
    @JsonGetter("educationLevel")
    public List<TargetGroupElementModel> getEducationLevel() {
        return educationLevel;
    }

    /**
     * Setter for EducationLevel.
     * Education Level required by the Candidate. You can specify only one value.
     * @param educationLevel Value for List of TargetGroupElementModel
     */
    @JsonSetter("educationLevel")
    public void setEducationLevel(List<TargetGroupElementModel> educationLevel) {
        this.educationLevel = educationLevel;
    }

    /**
     * Getter for Seniority.
     * Seniority Level expected by the Candidate. You can specify only one value.
     * @return Returns the List of TargetGroupElementModel
     */
    @JsonGetter("seniority")
    public List<TargetGroupElementModel> getSeniority() {
        return seniority;
    }

    /**
     * Setter for Seniority.
     * Seniority Level expected by the Candidate. You can specify only one value.
     * @param seniority Value for List of TargetGroupElementModel
     */
    @JsonSetter("seniority")
    public void setSeniority(List<TargetGroupElementModel> seniority) {
        this.seniority = seniority;
    }

    /**
     * Getter for Industry.
     * The Industry related to the Position open. You can specify only one value.
     * @return Returns the List of TargetGroupElementModel
     */
    @JsonGetter("industry")
    public List<TargetGroupElementModel> getIndustry() {
        return industry;
    }

    /**
     * Setter for Industry.
     * The Industry related to the Position open. You can specify only one value.
     * @param industry Value for List of TargetGroupElementModel
     */
    @JsonSetter("industry")
    public void setIndustry(List<TargetGroupElementModel> industry) {
        this.industry = industry;
    }

    /**
     * Getter for JobCategory.
     * Job Category indicates the type of Position that's open. You can specify only one value.
     * @return Returns the List of TargetGroupElementModel
     */
    @JsonGetter("jobCategory")
    public List<TargetGroupElementModel> getJobCategory() {
        return jobCategory;
    }

    /**
     * Setter for JobCategory.
     * Job Category indicates the type of Position that's open. You can specify only one value.
     * @param jobCategory Value for List of TargetGroupElementModel
     */
    @JsonSetter("jobCategory")
    public void setJobCategory(List<TargetGroupElementModel> jobCategory) {
        this.jobCategory = jobCategory;
    }

    /**
     * Converts this TargetGroupModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TargetGroupModel [" + "educationLevel=" + educationLevel + ", seniority="
                + seniority + ", industry=" + industry + ", jobCategory=" + jobCategory
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link TargetGroupModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TargetGroupModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(educationLevel, seniority, industry, jobCategory);
        return builder;
    }

    /**
     * Class to build instances of {@link TargetGroupModel}.
     */
    public static class Builder {
        private List<TargetGroupElementModel> educationLevel;
        private List<TargetGroupElementModel> seniority;
        private List<TargetGroupElementModel> industry;
        private List<TargetGroupElementModel> jobCategory;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  educationLevel  List of TargetGroupElementModel value for educationLevel.
         * @param  seniority  List of TargetGroupElementModel value for seniority.
         * @param  industry  List of TargetGroupElementModel value for industry.
         * @param  jobCategory  List of TargetGroupElementModel value for jobCategory.
         */
        public Builder(List<TargetGroupElementModel> educationLevel,
                List<TargetGroupElementModel> seniority, List<TargetGroupElementModel> industry,
                List<TargetGroupElementModel> jobCategory) {
            this.educationLevel = educationLevel;
            this.seniority = seniority;
            this.industry = industry;
            this.jobCategory = jobCategory;
        }

        /**
         * Setter for educationLevel.
         * @param  educationLevel  List of TargetGroupElementModel value for educationLevel.
         * @return Builder
         */
        public Builder educationLevel(List<TargetGroupElementModel> educationLevel) {
            this.educationLevel = educationLevel;
            return this;
        }

        /**
         * Setter for seniority.
         * @param  seniority  List of TargetGroupElementModel value for seniority.
         * @return Builder
         */
        public Builder seniority(List<TargetGroupElementModel> seniority) {
            this.seniority = seniority;
            return this;
        }

        /**
         * Setter for industry.
         * @param  industry  List of TargetGroupElementModel value for industry.
         * @return Builder
         */
        public Builder industry(List<TargetGroupElementModel> industry) {
            this.industry = industry;
            return this;
        }

        /**
         * Setter for jobCategory.
         * @param  jobCategory  List of TargetGroupElementModel value for jobCategory.
         * @return Builder
         */
        public Builder jobCategory(List<TargetGroupElementModel> jobCategory) {
            this.jobCategory = jobCategory;
            return this;
        }

        /**
         * Builds a new {@link TargetGroupModel} object using the set fields.
         * @return {@link TargetGroupModel}
         */
        public TargetGroupModel build() {
            return new TargetGroupModel(educationLevel, seniority, industry, jobCategory);
        }
    }
}
