# Write your MySQL query statement below
select *
from Cinema 
where description!= 'boring' AND id %2=1
order By rating desc;