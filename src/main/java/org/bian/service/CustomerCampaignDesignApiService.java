/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerCampaignDesignApiService {

	SDCustomerCampaignDesignActivateOutputModel activate(SDCustomerCampaignDesignActivateInputModel request);
	
	CRCustomerCampaignSpecificationCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRCustomerCampaignSpecificationCaptureInputModel request);
	
	SDCustomerCampaignDesignConfigureOutputModel configure(String sdReferenceId, SDCustomerCampaignDesignConfigureInputModel request);
	
	CRCustomerCampaignSpecificationControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerCampaignSpecificationControlInputModel request);
	
	CRCustomerCampaignSpecificationCreateOutputModel create(String sdReferenceId, CRCustomerCampaignSpecificationCreateInputModel request);
	
	CRCustomerCampaignSpecificationExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerCampaignSpecificationExchangeInputModel request);
	
	CRCustomerCampaignSpecificationExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerCampaignSpecificationExecuteInputModel request);
	
	SDCustomerCampaignDesignFeedbackOutputModel feedback(String sdReferenceId, SDCustomerCampaignDesignFeedbackInputModel request);
	
	CRCustomerCampaignSpecificationRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerCampaignSpecificationRequestInputModel request);
	
	CRCustomerCampaignSpecificationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCustomerCampaignDesignRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCustomerCampaignSpecificationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerCampaignSpecificationUpdateInputModel request);
	
}
