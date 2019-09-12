/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Design;

@BianRestController
public class CustomerCampaignDesignApiController {

	@Autowired
	CustomerCampaignDesignApiService service;
	
	@Design.Activate
	public BianResponse<SDCustomerCampaignDesignActivateOutputModel> activate(@RequestBody BianRequest<SDCustomerCampaignDesignActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Design.Capture
	public BianResponse<CRCustomerCampaignSpecificationCaptureOutputModel> capture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerCampaignSpecificationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.capture(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Design.Configure
	public BianResponse<SDCustomerCampaignDesignConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerCampaignDesignConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Design.Control
	public BianResponse<CRCustomerCampaignSpecificationControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerCampaignSpecificationControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Design.Create
	public BianResponse<CRCustomerCampaignSpecificationCreateOutputModel> create(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCustomerCampaignSpecificationCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.create(sdReferenceId, bianRequest.getData()));
	}
	
	@Design.Exchange
	public BianResponse<CRCustomerCampaignSpecificationExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerCampaignSpecificationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Design.Execute
	public BianResponse<CRCustomerCampaignSpecificationExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerCampaignSpecificationExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Design.Feedback
	public BianResponse<SDCustomerCampaignDesignFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerCampaignDesignFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Design.Request
	public BianResponse<CRCustomerCampaignSpecificationRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerCampaignSpecificationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Design.Retrieve
	public BianResponse<CRCustomerCampaignSpecificationRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Design.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Design.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Design.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Design.RetrieveSD
	public BianResponse<SDCustomerCampaignDesignRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Design.Update
	public BianResponse<CRCustomerCampaignSpecificationUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerCampaignSpecificationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
}
