package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignSpecificationUpdateInputModelCustomerCampaignSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationUpdateOutputModel
 */
public class CRCustomerCampaignSpecificationUpdateOutputModel   {
  private CRCustomerCampaignSpecificationUpdateInputModelCustomerCampaignSpecificationInstanceRecord customerCampaignSpecificationInstanceRecord = null;

  private String customerCampaignSpecificationUpdateActionTaskReference = null;

  private Object customerCampaignSpecificationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get customerCampaignSpecificationInstanceRecord
   * @return customerCampaignSpecificationInstanceRecord
  **/

  public CRCustomerCampaignSpecificationUpdateInputModelCustomerCampaignSpecificationInstanceRecord getCustomerCampaignSpecificationInstanceRecord() {
    return customerCampaignSpecificationInstanceRecord;
  }

  public void setCustomerCampaignSpecificationInstanceRecord(CRCustomerCampaignSpecificationUpdateInputModelCustomerCampaignSpecificationInstanceRecord customerCampaignSpecificationInstanceRecord) {
    this.customerCampaignSpecificationInstanceRecord = customerCampaignSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return customerCampaignSpecificationUpdateActionTaskReference
  **/

  public String getCustomerCampaignSpecificationUpdateActionTaskReference() {
    return customerCampaignSpecificationUpdateActionTaskReference;
  }

  public void setCustomerCampaignSpecificationUpdateActionTaskReference(String customerCampaignSpecificationUpdateActionTaskReference) {
    this.customerCampaignSpecificationUpdateActionTaskReference = customerCampaignSpecificationUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerCampaignSpecificationUpdateActionTaskRecord
  **/

  public Object getCustomerCampaignSpecificationUpdateActionTaskRecord() {
    return customerCampaignSpecificationUpdateActionTaskRecord;
  }

  public void setCustomerCampaignSpecificationUpdateActionTaskRecord(Object customerCampaignSpecificationUpdateActionTaskRecord) {
    this.customerCampaignSpecificationUpdateActionTaskRecord = customerCampaignSpecificationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

