create table java_developers as
select developers.name as developer, developers.age as age, developers.gender as gender from developers
inner join developers_skills on developers_skills.developer_id = developers.id
inner join skills on developers_skills.skill_id = skills.id
where skills.name = 'Java';