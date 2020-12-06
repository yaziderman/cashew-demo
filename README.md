# cashew-demo

This is a sample microservice application, designed and implemented as a demo for applying DDD model with Spring Boot to create a secure and restfull API service based solution.

## A demonstration of DDD modeling for FinFlx
### Strategic Design
#### Domain
The domain is “End Of Service”
#### Sub Domains*
We can identify the following sub domains:
- (Core Domain) End of service calculation: Calculating the end of service in different levels of granularity
- (Core Domain) Employees Records: Managing employees details.
- (Supporting Domain) Bonus Management: Managing employees incentives, allowances and bonuses and helping companies convert them into installments.
- (Supporting Domain) Employees Onboarding: Onboarding employees (Individually or by lot) and settle their accrued end of service amounts
- (Supporting Domain) Companies Onboarding: Onboarding companies and setup their preferences.
- (Supporting Domain) Employees Portal: A Portal enabling employees to access and control their financial statuses.
- (Generic Domain) Identity management: To make sure the right users have the right access.

#### Bounded Contexts

As an example, Employees Onboarding has the following contexts:

- Employee Creation
- Employee invitation
- ID scan
- Data collection

A Diagram is available [here](https://github.com/yaziderman/cashew-demo/blob/master/DDD%20Documentation.pdf)

### Relationships Between Contexts

A Diagram is available [here](https://github.com/yaziderman/cashew-demo/blob/master/DDD%20Documentation.pdf)

#### glossary of terms

```
Outstanding:
The total amount due for an employee or a list of employees, that a company has to pay as of now.
Paid: 
The amount paid until today
Accrued: 
The total amount due to the employee, whether paid or not.
```

Full Documentation with diagrams can be found [here](https://github.com/yaziderman/cashew-demo/blob/master/DDD%20Documentation.pdf)
