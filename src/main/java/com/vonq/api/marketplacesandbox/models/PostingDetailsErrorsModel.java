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
 * This is a model class for PostingDetailsErrorsModel type.
 */
public class PostingDetailsErrorsModel
        extends BaseModel {
    private List<String> title;
    private List<String> description;
    private List<String> yearsOfExperience;
    private List<String> employmentType;
    private OrganizationModel organization;
    private WorkingLocationModel workingLocation;
    private WeeklyWorkingHoursModel weeklyWorkingHours;
    private SalaryIndicationModel salaryIndication;
    private List<String> jobPageUrl;
    private List<String> applicationUrl;

    /**
     * Default constructor.
     */
    public PostingDetailsErrorsModel() {
    }

    /**
     * Initialization constructor.
     * @param  title  List of String value for title.
     * @param  description  List of String value for description.
     * @param  yearsOfExperience  List of String value for yearsOfExperience.
     * @param  employmentType  List of String value for employmentType.
     * @param  organization  OrganizationModel value for organization.
     * @param  workingLocation  WorkingLocationModel value for workingLocation.
     * @param  weeklyWorkingHours  WeeklyWorkingHoursModel value for weeklyWorkingHours.
     * @param  salaryIndication  SalaryIndicationModel value for salaryIndication.
     * @param  jobPageUrl  List of String value for jobPageUrl.
     * @param  applicationUrl  List of String value for applicationUrl.
     */
    public PostingDetailsErrorsModel(
            List<String> title,
            List<String> description,
            List<String> yearsOfExperience,
            List<String> employmentType,
            OrganizationModel organization,
            WorkingLocationModel workingLocation,
            WeeklyWorkingHoursModel weeklyWorkingHours,
            SalaryIndicationModel salaryIndication,
            List<String> jobPageUrl,
            List<String> applicationUrl) {
        this.title = title;
        this.description = description;
        this.yearsOfExperience = yearsOfExperience;
        this.employmentType = employmentType;
        this.organization = organization;
        this.workingLocation = workingLocation;
        this.weeklyWorkingHours = weeklyWorkingHours;
        this.salaryIndication = salaryIndication;
        this.jobPageUrl = jobPageUrl;
        this.applicationUrl = applicationUrl;
    }

    /**
     * Getter for Title.
     * @return Returns the List of String
     */
    @JsonGetter("title")
    public List<String> getTitle() {
        return title;
    }

    /**
     * Setter for Title.
     * @param title Value for List of String
     */
    @JsonSetter("title")
    public void setTitle(List<String> title) {
        this.title = title;
    }

    /**
     * Getter for Description.
     * @return Returns the List of String
     */
    @JsonGetter("description")
    public List<String> getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for List of String
     */
    @JsonSetter("description")
    public void setDescription(List<String> description) {
        this.description = description;
    }

    /**
     * Getter for YearsOfExperience.
     * @return Returns the List of String
     */
    @JsonGetter("yearsOfExperience")
    public List<String> getYearsOfExperience() {
        return yearsOfExperience;
    }

    /**
     * Setter for YearsOfExperience.
     * @param yearsOfExperience Value for List of String
     */
    @JsonSetter("yearsOfExperience")
    public void setYearsOfExperience(List<String> yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    /**
     * Getter for EmploymentType.
     * @return Returns the List of String
     */
    @JsonGetter("employmentType")
    public List<String> getEmploymentType() {
        return employmentType;
    }

    /**
     * Setter for EmploymentType.
     * @param employmentType Value for List of String
     */
    @JsonSetter("employmentType")
    public void setEmploymentType(List<String> employmentType) {
        this.employmentType = employmentType;
    }

    /**
     * Getter for Organization.
     * @return Returns the OrganizationModel
     */
    @JsonGetter("organization")
    public OrganizationModel getOrganization() {
        return organization;
    }

    /**
     * Setter for Organization.
     * @param organization Value for OrganizationModel
     */
    @JsonSetter("organization")
    public void setOrganization(OrganizationModel organization) {
        this.organization = organization;
    }

    /**
     * Getter for WorkingLocation.
     * @return Returns the WorkingLocationModel
     */
    @JsonGetter("workingLocation")
    public WorkingLocationModel getWorkingLocation() {
        return workingLocation;
    }

    /**
     * Setter for WorkingLocation.
     * @param workingLocation Value for WorkingLocationModel
     */
    @JsonSetter("workingLocation")
    public void setWorkingLocation(WorkingLocationModel workingLocation) {
        this.workingLocation = workingLocation;
    }

    /**
     * Getter for WeeklyWorkingHours.
     * @return Returns the WeeklyWorkingHoursModel
     */
    @JsonGetter("weeklyWorkingHours")
    public WeeklyWorkingHoursModel getWeeklyWorkingHours() {
        return weeklyWorkingHours;
    }

    /**
     * Setter for WeeklyWorkingHours.
     * @param weeklyWorkingHours Value for WeeklyWorkingHoursModel
     */
    @JsonSetter("weeklyWorkingHours")
    public void setWeeklyWorkingHours(WeeklyWorkingHoursModel weeklyWorkingHours) {
        this.weeklyWorkingHours = weeklyWorkingHours;
    }

    /**
     * Getter for SalaryIndication.
     * @return Returns the SalaryIndicationModel
     */
    @JsonGetter("salaryIndication")
    public SalaryIndicationModel getSalaryIndication() {
        return salaryIndication;
    }

    /**
     * Setter for SalaryIndication.
     * @param salaryIndication Value for SalaryIndicationModel
     */
    @JsonSetter("salaryIndication")
    public void setSalaryIndication(SalaryIndicationModel salaryIndication) {
        this.salaryIndication = salaryIndication;
    }

    /**
     * Getter for JobPageUrl.
     * @return Returns the List of String
     */
    @JsonGetter("jobPageUrl")
    public List<String> getJobPageUrl() {
        return jobPageUrl;
    }

    /**
     * Setter for JobPageUrl.
     * @param jobPageUrl Value for List of String
     */
    @JsonSetter("jobPageUrl")
    public void setJobPageUrl(List<String> jobPageUrl) {
        this.jobPageUrl = jobPageUrl;
    }

    /**
     * Getter for ApplicationUrl.
     * @return Returns the List of String
     */
    @JsonGetter("applicationUrl")
    public List<String> getApplicationUrl() {
        return applicationUrl;
    }

    /**
     * Setter for ApplicationUrl.
     * @param applicationUrl Value for List of String
     */
    @JsonSetter("applicationUrl")
    public void setApplicationUrl(List<String> applicationUrl) {
        this.applicationUrl = applicationUrl;
    }

    /**
     * Converts this PostingDetailsErrorsModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PostingDetailsErrorsModel [" + "title=" + title + ", description=" + description
                + ", yearsOfExperience=" + yearsOfExperience + ", employmentType=" + employmentType
                + ", organization=" + organization + ", workingLocation=" + workingLocation
                + ", weeklyWorkingHours=" + weeklyWorkingHours + ", salaryIndication="
                + salaryIndication + ", jobPageUrl=" + jobPageUrl + ", applicationUrl="
                + applicationUrl + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PostingDetailsErrorsModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PostingDetailsErrorsModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(title, description, yearsOfExperience, employmentType,
                organization, workingLocation, weeklyWorkingHours, salaryIndication, jobPageUrl,
                applicationUrl);
        return builder;
    }

    /**
     * Class to build instances of {@link PostingDetailsErrorsModel}.
     */
    public static class Builder {
        private List<String> title;
        private List<String> description;
        private List<String> yearsOfExperience;
        private List<String> employmentType;
        private OrganizationModel organization;
        private WorkingLocationModel workingLocation;
        private WeeklyWorkingHoursModel weeklyWorkingHours;
        private SalaryIndicationModel salaryIndication;
        private List<String> jobPageUrl;
        private List<String> applicationUrl;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  title  List of String value for title.
         * @param  description  List of String value for description.
         * @param  yearsOfExperience  List of String value for yearsOfExperience.
         * @param  employmentType  List of String value for employmentType.
         * @param  organization  OrganizationModel value for organization.
         * @param  workingLocation  WorkingLocationModel value for workingLocation.
         * @param  weeklyWorkingHours  WeeklyWorkingHoursModel value for weeklyWorkingHours.
         * @param  salaryIndication  SalaryIndicationModel value for salaryIndication.
         * @param  jobPageUrl  List of String value for jobPageUrl.
         * @param  applicationUrl  List of String value for applicationUrl.
         */
        public Builder(List<String> title, List<String> description, List<String> yearsOfExperience,
                List<String> employmentType, OrganizationModel organization,
                WorkingLocationModel workingLocation, WeeklyWorkingHoursModel weeklyWorkingHours,
                SalaryIndicationModel salaryIndication, List<String> jobPageUrl,
                List<String> applicationUrl) {
            this.title = title;
            this.description = description;
            this.yearsOfExperience = yearsOfExperience;
            this.employmentType = employmentType;
            this.organization = organization;
            this.workingLocation = workingLocation;
            this.weeklyWorkingHours = weeklyWorkingHours;
            this.salaryIndication = salaryIndication;
            this.jobPageUrl = jobPageUrl;
            this.applicationUrl = applicationUrl;
        }

        /**
         * Setter for title.
         * @param  title  List of String value for title.
         * @return Builder
         */
        public Builder title(List<String> title) {
            this.title = title;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  List of String value for description.
         * @return Builder
         */
        public Builder description(List<String> description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for yearsOfExperience.
         * @param  yearsOfExperience  List of String value for yearsOfExperience.
         * @return Builder
         */
        public Builder yearsOfExperience(List<String> yearsOfExperience) {
            this.yearsOfExperience = yearsOfExperience;
            return this;
        }

        /**
         * Setter for employmentType.
         * @param  employmentType  List of String value for employmentType.
         * @return Builder
         */
        public Builder employmentType(List<String> employmentType) {
            this.employmentType = employmentType;
            return this;
        }

        /**
         * Setter for organization.
         * @param  organization  OrganizationModel value for organization.
         * @return Builder
         */
        public Builder organization(OrganizationModel organization) {
            this.organization = organization;
            return this;
        }

        /**
         * Setter for workingLocation.
         * @param  workingLocation  WorkingLocationModel value for workingLocation.
         * @return Builder
         */
        public Builder workingLocation(WorkingLocationModel workingLocation) {
            this.workingLocation = workingLocation;
            return this;
        }

        /**
         * Setter for weeklyWorkingHours.
         * @param  weeklyWorkingHours  WeeklyWorkingHoursModel value for weeklyWorkingHours.
         * @return Builder
         */
        public Builder weeklyWorkingHours(WeeklyWorkingHoursModel weeklyWorkingHours) {
            this.weeklyWorkingHours = weeklyWorkingHours;
            return this;
        }

        /**
         * Setter for salaryIndication.
         * @param  salaryIndication  SalaryIndicationModel value for salaryIndication.
         * @return Builder
         */
        public Builder salaryIndication(SalaryIndicationModel salaryIndication) {
            this.salaryIndication = salaryIndication;
            return this;
        }

        /**
         * Setter for jobPageUrl.
         * @param  jobPageUrl  List of String value for jobPageUrl.
         * @return Builder
         */
        public Builder jobPageUrl(List<String> jobPageUrl) {
            this.jobPageUrl = jobPageUrl;
            return this;
        }

        /**
         * Setter for applicationUrl.
         * @param  applicationUrl  List of String value for applicationUrl.
         * @return Builder
         */
        public Builder applicationUrl(List<String> applicationUrl) {
            this.applicationUrl = applicationUrl;
            return this;
        }

        /**
         * Builds a new {@link PostingDetailsErrorsModel} object using the set fields.
         * @return {@link PostingDetailsErrorsModel}
         */
        public PostingDetailsErrorsModel build() {
            return new PostingDetailsErrorsModel(title, description, yearsOfExperience,
                    employmentType, organization, workingLocation, weeklyWorkingHours,
                    salaryIndication, jobPageUrl, applicationUrl);
        }
    }
}
