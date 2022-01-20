create table projects_info as
select projects.date as date, 
projects.name as project, 
count(developers_projects.developer_id) as developers 
from projects
inner join developers_projects on developers_projects.project_id = projects.id
group by projects.date, projects.name;