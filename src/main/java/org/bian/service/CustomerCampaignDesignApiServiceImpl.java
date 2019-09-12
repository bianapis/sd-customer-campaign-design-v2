/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerCampaignDesignApiServiceImpl implements CustomerCampaignDesignApiService {

	public SDCustomerCampaignDesignActivateOutputModel activate(SDCustomerCampaignDesignActivateInputModel request){
		return JsonReader.read("activate-SDCustomerCampaignDesignActivateOutputModel.json",new TypeReference<SDCustomerCampaignDesignActivateOutputModel>(){});
	}
	
	public CRCustomerCampaignSpecificationCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRCustomerCampaignSpecificationCaptureInputModel request){
		return JsonReader.read("capture-CRCustomerCampaignSpecificationCaptureOutputModel.json",new TypeReference<CRCustomerCampaignSpecificationCaptureOutputModel>(){});
	}
	
	public SDCustomerCampaignDesignConfigureOutputModel configure(String sdReferenceId, SDCustomerCampaignDesignConfigureInputModel request){
		return JsonReader.read("configure-SDCustomerCampaignDesignConfigureOutputModel.json",new TypeReference<SDCustomerCampaignDesignConfigureOutputModel>(){});
	}
	
	public CRCustomerCampaignSpecificationControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerCampaignSpecificationControlInputModel request){
		return JsonReader.read("control-CRCustomerCampaignSpecificationControlOutputModel.json",new TypeReference<CRCustomerCampaignSpecificationControlOutputModel>(){});
	}
	
	public CRCustomerCampaignSpecificationCreateOutputModel create(String sdReferenceId, CRCustomerCampaignSpecificationCreateInputModel request){
		return JsonReader.read("create-CRCustomerCampaignSpecificationCreateOutputModel.json",new TypeReference<CRCustomerCampaignSpecificationCreateOutputModel>(){});
	}
	
	public CRCustomerCampaignSpecificationExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerCampaignSpecificationExchangeInputModel request){
		return JsonReader.read("exchange-CRCustomerCampaignSpecificationExchangeOutputModel.json",new TypeReference<CRCustomerCampaignSpecificationExchangeOutputModel>(){});
	}
	
	public CRCustomerCampaignSpecificationExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerCampaignSpecificationExecuteInputModel request){
		return JsonReader.read("execute-CRCustomerCampaignSpecificationExecuteOutputModel.json",new TypeReference<CRCustomerCampaignSpecificationExecuteOutputModel>(){});
	}
	
	public SDCustomerCampaignDesignFeedbackOutputModel feedback(String sdReferenceId, SDCustomerCampaignDesignFeedbackInputModel request){
		return JsonReader.read("feedback-SDCustomerCampaignDesignFeedbackOutputModel.json",new TypeReference<SDCustomerCampaignDesignFeedbackOutputModel>(){});
	}
	
	public CRCustomerCampaignSpecificationRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerCampaignSpecificationRequestInputModel request){
		return JsonReader.read("request-CRCustomerCampaignSpecificationRequestOutputModel.json",new TypeReference<CRCustomerCampaignSpecificationRequestOutputModel>(){});
	}
	
	public CRCustomerCampaignSpecificationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustomerCampaignSpecificationRetrieveOutputModel.json",new TypeReference<CRCustomerCampaignSpecificationRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCustomerCampaignDesignRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCustomerCampaignDesignRetrieveOutputModel.json",new TypeReference<SDCustomerCampaignDesignRetrieveOutputModel>(){});
	}
	
	public CRCustomerCampaignSpecificationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerCampaignSpecificationUpdateInputModel request){
		return JsonReader.read("update-CRCustomerCampaignSpecificationUpdateOutputModel.json",new TypeReference<CRCustomerCampaignSpecificationUpdateOutputModel>(){});
	}
	
}
