package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignSpecificationRequestOutputModelCustomerCampaignSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationRequestOutputModel
 */
public class CRCustomerCampaignSpecificationRequestOutputModel   {
  private CRCustomerCampaignSpecificationRequestOutputModelCustomerCampaignSpecificationInstanceRecord customerCampaignSpecificationInstanceRecord = null;

  private String customerCampaignSpecificationRequestActionTaskReference = null;

  private Object customerCampaignSpecificationRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get customerCampaignSpecificationInstanceRecord
   * @return customerCampaignSpecificationInstanceRecord
  **/

  public CRCustomerCampaignSpecificationRequestOutputModelCustomerCampaignSpecificationInstanceRecord getCustomerCampaignSpecificationInstanceRecord() {
    return customerCampaignSpecificationInstanceRecord;
  }

  public void setCustomerCampaignSpecificationInstanceRecord(CRCustomerCampaignSpecificationRequestOutputModelCustomerCampaignSpecificationInstanceRecord customerCampaignSpecificationInstanceRecord) {
    this.customerCampaignSpecificationInstanceRecord = customerCampaignSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Campaign Specification instance request service call 
   * @return customerCampaignSpecificationRequestActionTaskReference
  **/

  public String getCustomerCampaignSpecificationRequestActionTaskReference() {
    return customerCampaignSpecificationRequestActionTaskReference;
  }

  public void setCustomerCampaignSpecificationRequestActionTaskReference(String customerCampaignSpecificationRequestActionTaskReference) {
    this.customerCampaignSpecificationRequestActionTaskReference = customerCampaignSpecificationRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerCampaignSpecificationRequestActionTaskRecord
  **/

  public Object getCustomerCampaignSpecificationRequestActionTaskRecord() {
    return customerCampaignSpecificationRequestActionTaskRecord;
  }

  public void setCustomerCampaignSpecificationRequestActionTaskRecord(Object customerCampaignSpecificationRequestActionTaskRecord) {
    this.customerCampaignSpecificationRequestActionTaskRecord = customerCampaignSpecificationRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

