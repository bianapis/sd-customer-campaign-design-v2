package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignSpecificationExecuteOutputModelCustomerCampaignSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationExecuteOutputModel
 */
public class CRCustomerCampaignSpecificationExecuteOutputModel   {
  private CRCustomerCampaignSpecificationExecuteOutputModelCustomerCampaignSpecificationInstanceRecord customerCampaignSpecificationInstanceRecord = null;

  private String customerCampaignSpecificationExecuteActionTaskReference = null;

  private Object customerCampaignSpecificationExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get customerCampaignSpecificationInstanceRecord
   * @return customerCampaignSpecificationInstanceRecord
  **/

  public CRCustomerCampaignSpecificationExecuteOutputModelCustomerCampaignSpecificationInstanceRecord getCustomerCampaignSpecificationInstanceRecord() {
    return customerCampaignSpecificationInstanceRecord;
  }

  public void setCustomerCampaignSpecificationInstanceRecord(CRCustomerCampaignSpecificationExecuteOutputModelCustomerCampaignSpecificationInstanceRecord customerCampaignSpecificationInstanceRecord) {
    this.customerCampaignSpecificationInstanceRecord = customerCampaignSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Campaign Specification instance execute service call 
   * @return customerCampaignSpecificationExecuteActionTaskReference
  **/

  public String getCustomerCampaignSpecificationExecuteActionTaskReference() {
    return customerCampaignSpecificationExecuteActionTaskReference;
  }

  public void setCustomerCampaignSpecificationExecuteActionTaskReference(String customerCampaignSpecificationExecuteActionTaskReference) {
    this.customerCampaignSpecificationExecuteActionTaskReference = customerCampaignSpecificationExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return customerCampaignSpecificationExecuteActionTaskRecord
  **/

  public Object getCustomerCampaignSpecificationExecuteActionTaskRecord() {
    return customerCampaignSpecificationExecuteActionTaskRecord;
  }

  public void setCustomerCampaignSpecificationExecuteActionTaskRecord(Object customerCampaignSpecificationExecuteActionTaskRecord) {
    this.customerCampaignSpecificationExecuteActionTaskRecord = customerCampaignSpecificationExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

