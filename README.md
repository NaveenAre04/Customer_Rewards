# Customer_Rewards
 A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent over $50 in each transaction   (e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points). 


Steps:

1)Download this Project and open in IDE.
2)Run the DemoApplication.java file.
3)Check the total rewards in response by using Postman
#The rest API to get customer rewards based on customer Id

for example:

http://localhost:8080/customers/1002/rewards

Response:

{
    "customerId": 1002,
    "lastMonthRewardPoints": 392,
    "lastSecondMonthRewardPoints": 186,
    "lastThirdMonthRewardPoints": 0,
    "totalRewards": 578
}
