/*
 * HAPI
 *
 * This file was automatically generated for VONQ by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.vonq.api.marketplacesandbox.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.vonq.api.marketplacesandbox.http.client.HttpContext;

/**
 * This is a model class for TakeCampaignOfflineErrorResponseException type.
 */
public class TakeCampaignOfflineErrorResponseException
        extends ApiException {
    private static final long serialVersionUID = -65906464261277433L;
    private String campaignId;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The http context of the API exception
     */
    public TakeCampaignOfflineErrorResponseException(String reason, HttpContext context) {
        super(reason, context);
    }


    /**
     * Getter for CampaignId.
     * @return Returns the String
     */
    @JsonGetter("campaignId")
    public String getCampaignId() {
        return this.campaignId;
    }

    /**
     * Setter for CampaignId.
     * @param campaignId Value for String
     */
    @JsonSetter("campaignId")
    private void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }
}
