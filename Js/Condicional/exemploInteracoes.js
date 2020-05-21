
/*
const array = ['xxxx', 'yyyy', 'aaaa']
for (let i = 0; i< array.length; i++){
     console.log('${i+1}. ${array[i]}')
}

const familia = [{
		nome: 'Jose',
		papel: 'pai'
	},
	{
		nome: 'maria',
		papel: 'mae'
	},
	{
		nome: 'marcos',
		papel: 'filho'
	},
	{
		nome: 'marta',
		papel: 'filha'
	},
]
for (let pessoa in familia) {
	console.log(familia[pessoa])
}
*/

const vetor = ['xxxx', 'yyyy', 'aaaa']
vetor.forEach((value, index, array) => {
	console.log('${index}')
})

