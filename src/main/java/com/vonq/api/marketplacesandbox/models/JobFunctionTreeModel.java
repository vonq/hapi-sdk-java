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
 * This is a model class for JobFunctionTreeModel type.
 */
public class JobFunctionTreeModel
        extends BaseModel {
    private double id;
    private String name;
    private List<JobFunctionTreeModel> children;

    /**
     * Default constructor.
     */
    public JobFunctionTreeModel() {
    }

    /**
     * Initialization constructor.
     * @param  id  double value for id.
     * @param  name  String value for name.
     * @param  children  List of JobFunctionTreeModel value for children.
     */
    public JobFunctionTreeModel(
            double id,
            String name,
            List<JobFunctionTreeModel> children) {
        this.id = id;
        this.name = name;
        this.children = children;
    }

    /**
     * Getter for Id.
     * @return Returns the double
     */
    @JsonGetter("id")
    public double getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for double
     */
    @JsonSetter("id")
    public void setId(double id) {
        this.id = id;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Children.
     * @return Returns the List of JobFunctionTreeModel
     */
    @JsonGetter("children")
    public List<JobFunctionTreeModel> getChildren() {
        return children;
    }

    /**
     * Setter for Children.
     * @param children Value for List of JobFunctionTreeModel
     */
    @JsonSetter("children")
    public void setChildren(List<JobFunctionTreeModel> children) {
        this.children = children;
    }

    /**
     * Converts this JobFunctionTreeModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "JobFunctionTreeModel [" + "id=" + id + ", name=" + name + ", children=" + children
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link JobFunctionTreeModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link JobFunctionTreeModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, name, children);
        return builder;
    }

    /**
     * Class to build instances of {@link JobFunctionTreeModel}.
     */
    public static class Builder {
        private double id;
        private String name;
        private List<JobFunctionTreeModel> children;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  double value for id.
         * @param  name  String value for name.
         * @param  children  List of JobFunctionTreeModel value for children.
         */
        public Builder(double id, String name, List<JobFunctionTreeModel> children) {
            this.id = id;
            this.name = name;
            this.children = children;
        }

        /**
         * Setter for id.
         * @param  id  double value for id.
         * @return Builder
         */
        public Builder id(double id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for children.
         * @param  children  List of JobFunctionTreeModel value for children.
         * @return Builder
         */
        public Builder children(List<JobFunctionTreeModel> children) {
            this.children = children;
            return this;
        }

        /**
         * Builds a new {@link JobFunctionTreeModel} object using the set fields.
         * @return {@link JobFunctionTreeModel}
         */
        public JobFunctionTreeModel build() {
            return new JobFunctionTreeModel(id, name, children);
        }
    }
}
