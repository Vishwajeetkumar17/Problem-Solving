# Write your MySQL query statement below
select f.name as Employee from Employee e inner join Employee f on e.id=f.managerId where e.salary<f.salary;