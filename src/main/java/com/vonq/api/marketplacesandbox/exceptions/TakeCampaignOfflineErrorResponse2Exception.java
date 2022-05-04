/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.vonq.api.marketplacesandbox.http.client.HttpContext;
import java.util.List;

/**
 * This is a model class for TakeCampaignOfflineErrorResponse2Exception type.
 */
public class TakeCampaignOfflineErrorResponse2Exception
        extends ApiException {
    private static final long serialVersionUID = -892746423601646624L;
    private List<String> campaignId;
    private List<String> status;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The http context of the API exception
     */
    public TakeCampaignOfflineErrorResponse2Exception(String reason, HttpContext context) {
        super(reason, context);
    }


    /**
     * Getter for CampaignId.
     * @return Returns the List of String
     */
    @JsonGetter("campaignId")
    public List<String> getCampaignId() {
        return this.campaignId;
    }

    /**
     * Setter for CampaignId.
     * @param campaignId Value for List of String
     */
    @JsonSetter("campaignId")
    private void setCampaignId(List<String> campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Getter for Status.
     * @return Returns the List of String
     */
    @JsonGetter("status")
    public List<String> getStatus() {
        return this.status;
    }

    /**
     * Setter for Status.
     * @param status Value for List of String
     */
    @JsonSetter("status")
    private void setStatus(List<String> status) {
        this.status = status;
    }
}
