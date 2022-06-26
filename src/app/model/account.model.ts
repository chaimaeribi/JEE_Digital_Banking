export interface AccountDetails {
  accountId:           string;
  balance:             number;
  currentPage:         number;
  totalPage:           number;
  pageSize:            number;
  accountOpreationDTO: AccountOpreation[];
}

export interface AccountOpreation {
  id:            number;
  operationDate: Date;
  amount:        number;
  type:          string;
  description:   string;
}
