/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for PostingDetailsModel type.
 */
public class PostingDetailsModel
        extends BaseModel {
    private String title;
    private String description;
    private PostingOrganizationModel organization;
    private PostingWorkingLocationModel workingLocation;
    private PostingContactInfoModel contactInfo;
    private double yearsOfExperience;
    private EmploymentTypeEnum employmentType;
    private PostingWeeklyWorkingHoursModel weeklyWorkingHours;
    private PostingSalaryIndicationModel salaryIndication;
    private String jobPageUrl;
    private String applicationUrl;

    /**
     * Default constructor.
     */
    public PostingDetailsModel() {
    }

    /**
     * Initialization constructor.
     * @param  title  String value for title.
     * @param  description  String value for description.
     * @param  organization  PostingOrganizationModel value for organization.
     * @param  workingLocation  PostingWorkingLocationModel value for workingLocation.
     * @param  yearsOfExperience  double value for yearsOfExperience.
     * @param  employmentType  EmploymentTypeEnum value for employmentType.
     * @param  weeklyWorkingHours  PostingWeeklyWorkingHoursModel value for weeklyWorkingHours.
     * @param  salaryIndication  PostingSalaryIndicationModel value for salaryIndication.
     * @param  jobPageUrl  String value for jobPageUrl.
     * @param  applicationUrl  String value for applicationUrl.
     * @param  contactInfo  PostingContactInfoModel value for contactInfo.
     */
    public PostingDetailsModel(
            String title,
            String description,
            PostingOrganizationModel organization,
            PostingWorkingLocationModel workingLocation,
            double yearsOfExperience,
            EmploymentTypeEnum employmentType,
            PostingWeeklyWorkingHoursModel weeklyWorkingHours,
            PostingSalaryIndicationModel salaryIndication,
            String jobPageUrl,
            String applicationUrl,
            PostingContactInfoModel contactInfo) {
        this.title = title;
        this.description = description;
        this.organization = organization;
        this.workingLocation = workingLocation;
        this.contactInfo = contactInfo;
        this.yearsOfExperience = yearsOfExperience;
        this.employmentType = employmentType;
        this.weeklyWorkingHours = weeklyWorkingHours;
        this.salaryIndication = salaryIndication;
        this.jobPageUrl = jobPageUrl;
        this.applicationUrl = applicationUrl;
    }

    /**
     * Getter for Title.
     * The title of the posting across the different Channels where the posting is going to be
     * published.
     * @return Returns the String
     */
    @JsonGetter("title")
    public String getTitle() {
        return title;
    }

    /**
     * Setter for Title.
     * The title of the posting across the different Channels where the posting is going to be
     * published.
     * @param title Value for String
     */
    @JsonSetter("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for Description.
     * Full description of the job posting, including all possible sections **Allowed tags:**
     * `a[href|target], em, b, br, strong, i, li, ol, p, ul`
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * Full description of the job posting, including all possible sections **Allowed tags:**
     * `a[href|target], em, b, br, strong, i, li, ol, p, ul`
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Organization.
     * @return Returns the PostingOrganizationModel
     */
    @JsonGetter("organization")
    public PostingOrganizationModel getOrganization() {
        return organization;
    }

    /**
     * Setter for Organization.
     * @param organization Value for PostingOrganizationModel
     */
    @JsonSetter("organization")
    public void setOrganization(PostingOrganizationModel organization) {
        this.organization = organization;
    }

    /**
     * Getter for WorkingLocation.
     * @return Returns the PostingWorkingLocationModel
     */
    @JsonGetter("workingLocation")
    public PostingWorkingLocationModel getWorkingLocation() {
        return workingLocation;
    }

    /**
     * Setter for WorkingLocation.
     * @param workingLocation Value for PostingWorkingLocationModel
     */
    @JsonSetter("workingLocation")
    public void setWorkingLocation(PostingWorkingLocationModel workingLocation) {
        this.workingLocation = workingLocation;
    }

    /**
     * Getter for ContactInfo.
     * Contact is whom to contact about the job. This may be part of the posting info for candidates
     * to know whom they can reach out to learn more about the vacancy.
     * @return Returns the PostingContactInfoModel
     */
    @JsonGetter("contactInfo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PostingContactInfoModel getContactInfo() {
        return contactInfo;
    }

    /**
     * Setter for ContactInfo.
     * Contact is whom to contact about the job. This may be part of the posting info for candidates
     * to know whom they can reach out to learn more about the vacancy.
     * @param contactInfo Value for PostingContactInfoModel
     */
    @JsonSetter("contactInfo")
    public void setContactInfo(PostingContactInfoModel contactInfo) {
        this.contactInfo = contactInfo;
    }

    /**
     * Getter for YearsOfExperience.
     * Numbers of years of experience required for this position
     * @return Returns the double
     */
    @JsonGetter("yearsOfExperience")
    public double getYearsOfExperience() {
        return yearsOfExperience;
    }

    /**
     * Setter for YearsOfExperience.
     * Numbers of years of experience required for this position
     * @param yearsOfExperience Value for double
     */
    @JsonSetter("yearsOfExperience")
    public void setYearsOfExperience(double yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    /**
     * Getter for EmploymentType.
     * The type of employment of the posting, whether it's a permanent position or a fixed time
     * position
     * @return Returns the EmploymentTypeEnum
     */
    @JsonGetter("employmentType")
    public EmploymentTypeEnum getEmploymentType() {
        return employmentType;
    }

    /**
     * Setter for EmploymentType.
     * The type of employment of the posting, whether it's a permanent position or a fixed time
     * position
     * @param employmentType Value for EmploymentTypeEnum
     */
    @JsonSetter("employmentType")
    public void setEmploymentType(EmploymentTypeEnum employmentType) {
        this.employmentType = employmentType;
    }

    /**
     * Getter for WeeklyWorkingHours.
     * @return Returns the PostingWeeklyWorkingHoursModel
     */
    @JsonGetter("weeklyWorkingHours")
    public PostingWeeklyWorkingHoursModel getWeeklyWorkingHours() {
        return weeklyWorkingHours;
    }

    /**
     * Setter for WeeklyWorkingHours.
     * @param weeklyWorkingHours Value for PostingWeeklyWorkingHoursModel
     */
    @JsonSetter("weeklyWorkingHours")
    public void setWeeklyWorkingHours(PostingWeeklyWorkingHoursModel weeklyWorkingHours) {
        this.weeklyWorkingHours = weeklyWorkingHours;
    }

    /**
     * Getter for SalaryIndication.
     * @return Returns the PostingSalaryIndicationModel
     */
    @JsonGetter("salaryIndication")
    public PostingSalaryIndicationModel getSalaryIndication() {
        return salaryIndication;
    }

    /**
     * Setter for SalaryIndication.
     * @param salaryIndication Value for PostingSalaryIndicationModel
     */
    @JsonSetter("salaryIndication")
    public void setSalaryIndication(PostingSalaryIndicationModel salaryIndication) {
        this.salaryIndication = salaryIndication;
    }

    /**
     * Getter for JobPageUrl.
     * Link to the page with the description of the job
     * @return Returns the String
     */
    @JsonGetter("jobPageUrl")
    public String getJobPageUrl() {
        return jobPageUrl;
    }

    /**
     * Setter for JobPageUrl.
     * Link to the page with the description of the job
     * @param jobPageUrl Value for String
     */
    @JsonSetter("jobPageUrl")
    public void setJobPageUrl(String jobPageUrl) {
        this.jobPageUrl = jobPageUrl;
    }

    /**
     * Getter for ApplicationUrl.
     * Link to the page where the candidate needs to be directed when applying for a position
     * @return Returns the String
     */
    @JsonGetter("applicationUrl")
    public String getApplicationUrl() {
        return applicationUrl;
    }

    /**
     * Setter for ApplicationUrl.
     * Link to the page where the candidate needs to be directed when applying for a position
     * @param applicationUrl Value for String
     */
    @JsonSetter("applicationUrl")
    public void setApplicationUrl(String applicationUrl) {
        this.applicationUrl = applicationUrl;
    }

    /**
     * Converts this PostingDetailsModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PostingDetailsModel [" + "title=" + title + ", description=" + description
                + ", organization=" + organization + ", workingLocation=" + workingLocation
                + ", yearsOfExperience=" + yearsOfExperience + ", employmentType=" + employmentType
                + ", weeklyWorkingHours=" + weeklyWorkingHours + ", salaryIndication="
                + salaryIndication + ", jobPageUrl=" + jobPageUrl + ", applicationUrl="
                + applicationUrl + ", contactInfo=" + contactInfo + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PostingDetailsModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PostingDetailsModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(title, description, organization, workingLocation,
                yearsOfExperience, employmentType, weeklyWorkingHours, salaryIndication, jobPageUrl,
                applicationUrl)
                .contactInfo(getContactInfo());
        return builder;
    }

    /**
     * Class to build instances of {@link PostingDetailsModel}.
     */
    public static class Builder {
        private String title;
        private String description;
        private PostingOrganizationModel organization;
        private PostingWorkingLocationModel workingLocation;
        private double yearsOfExperience;
        private EmploymentTypeEnum employmentType;
        private PostingWeeklyWorkingHoursModel weeklyWorkingHours;
        private PostingSalaryIndicationModel salaryIndication;
        private String jobPageUrl;
        private String applicationUrl;
        private PostingContactInfoModel contactInfo;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  title  String value for title.
         * @param  description  String value for description.
         * @param  organization  PostingOrganizationModel value for organization.
         * @param  workingLocation  PostingWorkingLocationModel value for workingLocation.
         * @param  yearsOfExperience  double value for yearsOfExperience.
         * @param  employmentType  EmploymentTypeEnum value for employmentType.
         * @param  weeklyWorkingHours  PostingWeeklyWorkingHoursModel value for weeklyWorkingHours.
         * @param  salaryIndication  PostingSalaryIndicationModel value for salaryIndication.
         * @param  jobPageUrl  String value for jobPageUrl.
         * @param  applicationUrl  String value for applicationUrl.
         */
        public Builder(String title, String description, PostingOrganizationModel organization,
                PostingWorkingLocationModel workingLocation, double yearsOfExperience,
                EmploymentTypeEnum employmentType,
                PostingWeeklyWorkingHoursModel weeklyWorkingHours,
                PostingSalaryIndicationModel salaryIndication, String jobPageUrl,
                String applicationUrl) {
            this.title = title;
            this.description = description;
            this.organization = organization;
            this.workingLocation = workingLocation;
            this.yearsOfExperience = yearsOfExperience;
            this.employmentType = employmentType;
            this.weeklyWorkingHours = weeklyWorkingHours;
            this.salaryIndication = salaryIndication;
            this.jobPageUrl = jobPageUrl;
            this.applicationUrl = applicationUrl;
        }

        /**
         * Setter for title.
         * @param  title  String value for title.
         * @return Builder
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for organization.
         * @param  organization  PostingOrganizationModel value for organization.
         * @return Builder
         */
        public Builder organization(PostingOrganizationModel organization) {
            this.organization = organization;
            return this;
        }

        /**
         * Setter for workingLocation.
         * @param  workingLocation  PostingWorkingLocationModel value for workingLocation.
         * @return Builder
         */
        public Builder workingLocation(PostingWorkingLocationModel workingLocation) {
            this.workingLocation = workingLocation;
            return this;
        }

        /**
         * Setter for yearsOfExperience.
         * @param  yearsOfExperience  double value for yearsOfExperience.
         * @return Builder
         */
        public Builder yearsOfExperience(double yearsOfExperience) {
            this.yearsOfExperience = yearsOfExperience;
            return this;
        }

        /**
         * Setter for employmentType.
         * @param  employmentType  EmploymentTypeEnum value for employmentType.
         * @return Builder
         */
        public Builder employmentType(EmploymentTypeEnum employmentType) {
            this.employmentType = employmentType;
            return this;
        }

        /**
         * Setter for weeklyWorkingHours.
         * @param  weeklyWorkingHours  PostingWeeklyWorkingHoursModel value for weeklyWorkingHours.
         * @return Builder
         */
        public Builder weeklyWorkingHours(PostingWeeklyWorkingHoursModel weeklyWorkingHours) {
            this.weeklyWorkingHours = weeklyWorkingHours;
            return this;
        }

        /**
         * Setter for salaryIndication.
         * @param  salaryIndication  PostingSalaryIndicationModel value for salaryIndication.
         * @return Builder
         */
        public Builder salaryIndication(PostingSalaryIndicationModel salaryIndication) {
            this.salaryIndication = salaryIndication;
            return this;
        }

        /**
         * Setter for jobPageUrl.
         * @param  jobPageUrl  String value for jobPageUrl.
         * @return Builder
         */
        public Builder jobPageUrl(String jobPageUrl) {
            this.jobPageUrl = jobPageUrl;
            return this;
        }

        /**
         * Setter for applicationUrl.
         * @param  applicationUrl  String value for applicationUrl.
         * @return Builder
         */
        public Builder applicationUrl(String applicationUrl) {
            this.applicationUrl = applicationUrl;
            return this;
        }

        /**
         * Setter for contactInfo.
         * @param  contactInfo  PostingContactInfoModel value for contactInfo.
         * @return Builder
         */
        public Builder contactInfo(PostingContactInfoModel contactInfo) {
            this.contactInfo = contactInfo;
            return this;
        }

        /**
         * Builds a new {@link PostingDetailsModel} object using the set fields.
         * @return {@link PostingDetailsModel}
         */
        public PostingDetailsModel build() {
            return new PostingDetailsModel(title, description, organization, workingLocation,
                    yearsOfExperience, employmentType, weeklyWorkingHours, salaryIndication,
                    jobPageUrl, applicationUrl, contactInfo);
        }
    }
}
