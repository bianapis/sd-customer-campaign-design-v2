package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignSpecificationCreateInputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecordCustomerCampaignProcedureInstanceReference;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationCreateInputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecord
 */
public class CRCustomerCampaignSpecificationCreateInputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecord   {
  private CRCustomerCampaignSpecificationCreateInputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecordCustomerCampaignProcedureInstanceReference customerCampaignProcedureInstanceReference = null;


  /**
   * Get customerCampaignProcedureInstanceReference
   * @return customerCampaignProcedureInstanceReference
  **/

  public CRCustomerCampaignSpecificationCreateInputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecordCustomerCampaignProcedureInstanceReference getCustomerCampaignProcedureInstanceReference() {
    return customerCampaignProcedureInstanceReference;
  }

  public void setCustomerCampaignProcedureInstanceReference(CRCustomerCampaignSpecificationCreateInputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignPerformanceRecordCustomerCampaignProcedureInstanceReference customerCampaignProcedureInstanceReference) {
    this.customerCampaignProcedureInstanceReference = customerCampaignProcedureInstanceReference;
  }


}

