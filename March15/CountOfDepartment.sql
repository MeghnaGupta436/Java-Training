SELECT d.DEPARTMENT_NAME,COUNT(d.DEPARTMENT_NAME)
FROM employees e
JOIN departments d
USING (DEPARTMENT_ID)
group by d.DEPARTMENT_NAME