# Write your MySQL query statement below
select email
from Person
having count(email)>1;